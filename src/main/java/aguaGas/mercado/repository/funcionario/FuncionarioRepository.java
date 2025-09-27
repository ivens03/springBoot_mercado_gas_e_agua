package aguaGas.mercado.repository.funcionario;

import aguaGas.mercado.model.funcionario.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {

    List<FuncionarioModel> findByFuncionarioAtivoTrue();

}
