package aguaGas.mercado.controller.fornecedor;

import aguaGas.mercado.model.fornecedor.FornecedoresModel;
import aguaGas.mercado.services.fornecedor.FornecedoresServices;
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
    public ResponseEntity<FornecedoresModel> cadastrarFornecedor(@RequestBody FornecedoresModel fornecedoresModel) {
        FornecedoresModel salvar = fornecedoresServices.salvarFornecedor(fornecedoresModel);
        return ResponseEntity.ok().body(salvar);
    }

    //Atualizar
    @PutMapping("/{id}")
    public ResponseEntity<FornecedoresModel> atualizarFornecedor(@PathVariable Long idFornecedor, @RequestBody FornecedoresModel fornecedoresModel) {
        return fornecedoresServices.listarFornecedorPorId(idFornecedor)
                .map( fornecedor ->{
                    fornecedor.setIdFornecedor(idFornecedor);
                    FornecedoresModel atualizacao = fornecedoresServices.salvarFornecedor(fornecedoresModel);
                    return ResponseEntity.ok().body(atualizacao);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());

    }

    //Listar todos
    @GetMapping("/all")
    public ResponseEntity<List<FornecedoresModel>> listarFornecedores() {
        List<FornecedoresModel> listagemDeTodosFornecedores = fornecedoresServices.listarFornecedores();
        return ResponseEntity.ok(listagemDeTodosFornecedores);
    }

    //Listagem por id
    @GetMapping("/{id}")
    public ResponseEntity<FornecedoresModel> listarFornecedorPorId(@PathVariable Long id_fornecedor) {
        return fornecedoresServices.listarFornecedorPorId(id_fornecedor)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
