package aguaGas.mercado.services.custos;

import aguaGas.mercado.model.custos.CustosFuncionariosModel;
import aguaGas.mercado.repository.custos.CustosFuncionariosRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CustosFuncionariosServices {

    private final CustosFuncionariosRepository custosFuncionariosRepository;

    public CustosFuncionariosServices (CustosFuncionariosRepository custosFuncionariosRepository) {
        this.custosFuncionariosRepository = custosFuncionariosRepository;
    }

    //salvar salario
}
