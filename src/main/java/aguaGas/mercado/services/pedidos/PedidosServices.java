package aguaGas.mercado.services.pedidos;

import aguaGas.mercado.model.pedidos.PedidosModel;
import aguaGas.mercado.repository.pedidos.PedidosRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PedidosServices {

    private final PedidosRepository pedidosRepository;

    public PedidosServices(PedidosRepository pedidosRepository) {
        this.pedidosRepository = pedidosRepository;
    }

    public PedidosModel salvarPedidos(PedidosModel pedidosModel) {
        pedidosModel.setDataPedido(LocalDateTime.now());
        return pedidosRepository.save(pedidosModel);
    }
}
