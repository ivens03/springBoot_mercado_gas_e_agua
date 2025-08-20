package aguaGas.mercado.repository.fornecedor;

import aguaGas.mercado.model.fornecedor.FornecedoresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FornecedoresRepository extends JpaRepository<FornecedoresModel, Long> {
  List<FornecedoresModel> findByFornecedorAtivoTrue();
}
