package aguaGas.mercado.controller.funcionario;

import aguaGas.mercado.model.funcionario.FuncionarioModel;
import aguaGas.mercado.services.custos.CustosFuncionariosServices;
import aguaGas.mercado.services.funcionario.funcionarioServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")
public class funcionarioController {

    private final CustosFuncionariosServices custosFuncionariosServices;
    private final aguaGas.mercado.services.funcionario.funcionarioServices funcionarioServices;

    public funcionarioController(CustosFuncionariosServices custosFuncionariosServices, funcionarioServices funcionarioServices) {
        this.custosFuncionariosServices = custosFuncionariosServices;
        this.funcionarioServices = funcionarioServices;
    }

    @PostMapping
    public ResponseEntity<FuncionarioModel> cadastrarFuncionario(@RequestBody FuncionarioModel funcionarioModel) {
        FuncionarioModel salvarNoSistema = funcionarioServices.salvarFuncionario(funcionarioModel);
        return ResponseEntity.ok(salvarNoSistema);
    }

}
