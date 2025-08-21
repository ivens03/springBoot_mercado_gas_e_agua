package aguaGas.mercado.repository.custos;

import aguaGas.mercado.model.custos.CustosAluguelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustosAluguelRepository extends JpaRepository<CustosAluguelModel, Long> {
}
