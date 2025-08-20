package aguaGas.mercado.repository.pedidos;

import aguaGas.mercado.model.pedidos.PedidosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidosRepository extends JpaRepository<PedidosModel, Long> {
}
