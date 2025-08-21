package aguaGas.mercado.services.custos;

import aguaGas.mercado.repository.custos.CustosTotaisRepository;
import org.springframework.stereotype.Service;

@Service
public class CustosTotaisServices {

    private final CustosTotaisRepository custosTotaisRepository;

    public CustosTotaisServices(CustosTotaisRepository custosTotaisRepository) {
        this.custosTotaisRepository = custosTotaisRepository;
    }

    // Custo
/*    public CustosTotaisModel custosTotaisDiarios (CustosTotaisModel custosTotaisModel) {
        custosTotaisModel.setCustoMensal(LocalDate.now());

    }*/

}
