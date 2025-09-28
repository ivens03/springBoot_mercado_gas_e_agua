package aguaGas.mercado.controller.informacoesCompartilhadas;

import aguaGas.mercado.dto.informacoesCompartilhadas.EnderecoDTO;
import aguaGas.mercado.model.informacoesCompartilhadas.EnderecoModel;
import aguaGas.mercado.services.informacoesCompartilhadas.EnderecoServices;
import org.springframework.http.HttpStatus;
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
    @PostMapping("/salvar")
    public ResponseEntity<EnderecoDTO>cadastrarEndereco(@RequestBody EnderecoDTO endereco) {
        EnderecoDTO enderecoDTO = enderecoServices.salvarEndereco(endereco);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(enderecoDTO);
    }

    //Atualizar
    @PutMapping("/{id}")
    public ResponseEntity<EnderecoModel> atualizarEndereco(@PathVariable Long idEndereco, @RequestBody EnderecoModel enderecoModel) {
        return enderecoServices.buscarEnderecoPorVez(idEndereco)
                .map( endereco -> {
                    endereco.setIdEndereco(idEndereco);
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
    public ResponseEntity<EnderecoModel> listarEnderecoPorId(@PathVariable Long idEndereco) {
        return enderecoServices.buscarEnderecoPorVez(idEndereco)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //Deletar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEndereco(@PathVariable Long idEndereco) {
        enderecoServices.apagarEndereco(idEndereco);
        return ResponseEntity.noContent().build();
    }

}
