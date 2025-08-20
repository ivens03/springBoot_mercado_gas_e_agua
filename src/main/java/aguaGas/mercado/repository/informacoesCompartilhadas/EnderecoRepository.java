package aguaGas.mercado.repository.informacoesCompartilhadas;

import aguaGas.mercado.model.informacoesCompartilhadas.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel, Long> {

    List<EnderecoModel> findByEnderecoAtivoTrue();

}
