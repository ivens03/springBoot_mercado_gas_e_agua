package aguaGas.mercado.controller.custos;

import aguaGas.mercado.model.custos.CustosAluguelModel;
import aguaGas.mercado.services.custos.CustosAluguelServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custo/aluguel")
public class CustosAluguelController {

    private final CustosAluguelServices custosAluguelServices;

    public CustosAluguelController(CustosAluguelServices custosAluguelServices) {
        this.custosAluguelServices = custosAluguelServices;
    }

    //Salvar
    @PostMapping
    public ResponseEntity<CustosAluguelModel> cadastroCustoLocacao(@RequestBody CustosAluguelModel custosAluguelModel) {
        CustosAluguelModel salvar = custosAluguelServices.salvarCustosComLocao(custosAluguelModel);
        return ResponseEntity.ok().body(salvar);
    }
}
