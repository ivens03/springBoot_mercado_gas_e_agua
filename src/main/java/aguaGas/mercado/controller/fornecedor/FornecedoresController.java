package aguaGas.mercado.controller.fornecedor;

import aguaGas.mercado.dto.fornecedor.FornecedoresDTO;
import aguaGas.mercado.services.fornecedor.FornecedoresServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class FornecedoresController {

    private final FornecedoresServices fornecedoresServices;

    public FornecedoresController(FornecedoresServices fornecedoresServices) {
        this.fornecedoresServices = fornecedoresServices;
    }

    //Salvar
    @PostMapping
    public ResponseEntity<FornecedoresDTO> cadastrarFornecedor(@RequestBody FornecedoresDTO fornecedor) {
        FornecedoresDTO fornecedoresDTO = fornecedoresServices.salvarFornecedor(fornecedor);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(fornecedoresDTO);
    }

    //Listar todos
    @GetMapping("/all")
    public ResponseEntity<List<FornecedoresDTO>> listarFornecedores() {
        List<FornecedoresDTO> listagemDeTodosFornecedores = fornecedoresServices.listarFornecedores();
        return ResponseEntity.ok(listagemDeTodosFornecedores);
    }

    // Listar um por vez
    @GetMapping("/{idFornecedor}")
    public ResponseEntity<?> listarFornecedorPorId(@PathVariable Long idFornecedor) {
        FornecedoresDTO fornecedoresDTO = fornecedoresServices.listarFornecedorPorId(idFornecedor);
        if (fornecedoresDTO != null) {
            return ResponseEntity.ok(fornecedoresDTO);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Fornecedor não foi encontrado");
    }

    //Atualizar
    @PutMapping("/atualizar/{idFornecedor}")
    public ResponseEntity<?> atualizarFornecedor(@PathVariable Long idFornecedor, @RequestBody FornecedoresDTO fornecedoresDTO) {
        FornecedoresDTO fornecedor = fornecedoresServices.atualizarFornecedor(idFornecedor, fornecedoresDTO);
        if (fornecedoresDTO != null) {
            return ResponseEntity.ok(fornecedor);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Fornecedor não foi encontrado");
        }
    }

    //Deletar
    @DeleteMapping("/apagar/{idFornecedor}")
    public ResponseEntity<String> deletarFornecedor(@PathVariable Long idFornecedor) {
        if (fornecedoresServices.listarFornecedorPorId(idFornecedor) != null) {
            fornecedoresServices.apagarFornecedor(idFornecedor);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O fornecedor não foi encontrado.");
    }
}
