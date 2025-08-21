package aguaGas.mercado.repository.custos;

import aguaGas.mercado.model.custos.CustosMensalFuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustosTotaisRepository extends JpaRepository<CustosMensalFuncionarioModel, Long> {
}
