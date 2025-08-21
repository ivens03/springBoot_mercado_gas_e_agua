package aguaGas.mercado.repository.custos;

import aguaGas.mercado.model.custos.CustosFuncionariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustosFuncionariosRepository extends JpaRepository<CustosFuncionariosModel, Long> {
}
