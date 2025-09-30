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
    @PutMapping("atualizar/{idEndereco}")
    public ResponseEntity<?> atualizarEndereco(@PathVariable Long idEndereco, @RequestBody EnderecoDTO enderecoDTO) {
        EnderecoDTO endereco = enderecoServices.atualizarEndereco(idEndereco, enderecoDTO);
        if (endereco != null) {
            return ResponseEntity.ok(endereco);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Endereço não foi encontrado.");
        }
    }

    //Listar todos
    @GetMapping("/all")
    public ResponseEntity<List<EnderecoDTO>> listagemEnderecos() {
        List<EnderecoDTO> listagemDeTodosEnderecos = enderecoServices.listarTodosEnderecos();
        return ResponseEntity.ok(listagemDeTodosEnderecos);
    }

    //Listagem por id
    @GetMapping("/{idEndereco}")
    public ResponseEntity<?> listarEnderecoPorId(@PathVariable Long idEndereco) {
        EnderecoDTO enderecoDTO = enderecoServices.buscarEnderecoPorVez(idEndereco);
        if (enderecoDTO != null) {
            return ResponseEntity.ok(enderecoDTO);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Endereço não foi encontrado.");
        }
    }

    //Deletar
    @DeleteMapping("apagar/{idEndereco}")
    public ResponseEntity<String> deletarEndereco(@PathVariable Long idEndereco) {
        if(enderecoServices.buscarEnderecoPorVez(idEndereco) != null) {
            enderecoServices.apagarEndereco(idEndereco);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O endereço não foi encontrado.");
    }

}
