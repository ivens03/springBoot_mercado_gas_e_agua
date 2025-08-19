package aguaGas.mercado.controller.informacoesCompartilhadas;

import aguaGas.mercado.model.informacoesCompartilhadas.EnderecoModel;
import aguaGas.mercado.services.informacoesCompartilhadas.EnderecoServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    private final EnderecoServices enderecoServices;

    public EnderecoController(EnderecoServices enderecoServices) {
        this.enderecoServices = enderecoServices;
    }

    //Salvar
    @PostMapping
    public ResponseEntity<EnderecoModel>cadastrarEndereco(@RequestBody EnderecoModel enderecoModel) {
        EnderecoModel salvar  = enderecoServices.salvarEndereco(enderecoModel);
        return ResponseEntity.ok().body(salvar);
    }

    //Atualizar
    @PutMapping("/{id}")
    public ResponseEntity<EnderecoModel> atualizarEndereco(@PathVariable Long id_endereco, @RequestBody EnderecoModel enderecoModel) {
        return enderecoServices.buscarEnderecoPorVez(id_endereco)
                .map( endereco -> {
                    endereco.setId_endereco(id_endereco);
                    EnderecoModel atualizacao = enderecoServices.atualizarEndereco(endereco);
                    return ResponseEntity.ok().body(atualizacao);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Listar todos
    @GetMapping("/all")
    public ResponseEntity<List<EnderecoModel>> listagemEnderecos() {
        List<EnderecoModel> listagemDeTodosEnderecos = enderecoServices.listarTodosEnderecos();
        return ResponseEntity.ok(listagemDeTodosEnderecos);
    }

    //Listagem por id
    @GetMapping("/{id}")
    public ResponseEntity<EnderecoModel> listarEnderecoPorId(@PathVariable Long id_endereco) {
        return enderecoServices.buscarEnderecoPorVez(id_endereco)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //Deletar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEndereco(@PathVariable Long id_endereco) {
        enderecoServices.apagarEndereco(id_endereco);
        return ResponseEntity.noContent().build();
    }

}
