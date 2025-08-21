package aguaGas.mercado.services.custos;

import aguaGas.mercado.model.custos.CustosAluguelModel;
import aguaGas.mercado.repository.custos.CustosAluguelRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CustosAluguelServices {

    private final CustosAluguelRepository custosAluguelRepository;

    public CustosAluguelServices(CustosAluguelRepository custosAluguelRepository) {
        this.custosAluguelRepository = custosAluguelRepository;
    }

    //salvar
    public CustosAluguelModel salvarCustosComLocao(CustosAluguelModel custosAluguelModel) {
        if(custosAluguelModel.getIptu() == null) {
            custosAluguelModel.setIptu(BigDecimal.ZERO);
        }
        if (custosAluguelModel.getValorAluguel() == null) {
            custosAluguelModel.setValorAluguel(BigDecimal.ZERO);
        }
        return custosAluguelRepository.save(custosAluguelModel);
    }
}
