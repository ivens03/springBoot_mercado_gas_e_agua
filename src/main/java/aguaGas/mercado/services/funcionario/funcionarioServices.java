package aguaGas.mercado.services.funcionario;

import aguaGas.mercado.model.funcionario.FuncionarioModel;
import aguaGas.mercado.repository.funcionario.FuncionarioRepository;
import org.springframework.stereotype.Service;

@Service
public class funcionarioServices {

    private final FuncionarioRepository funcionarioRepository;

    public funcionarioServices(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    //salvar
    public FuncionarioModel salvarFuncionario(FuncionarioModel funcionarioModel) {
        funcionarioModel.setFuncionarioAtivo(true);
        return funcionarioRepository.save(funcionarioModel);
    }

}
