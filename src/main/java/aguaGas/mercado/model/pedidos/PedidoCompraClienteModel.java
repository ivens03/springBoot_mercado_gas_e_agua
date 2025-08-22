package aguaGas.mercado.model.pedidos;

import aguaGas.mercado.model.estoque.ProdutosModel;
import aguaGas.mercado.model.fornecedor.FornecedoresModel;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "pedidosCompra")
public class PedidoCompraClienteModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPedidoCompraCliente;

    @ManyToOne
    private FornecedoresModel fornecedor;

    private LocalDate dataPedido;
    private LocalDate dataPrevistaEntrega;
    private String status; // Ex: "PENDENTE", "RECEBIDO", "CANCELADO"

    @OneToMany(mappedBy="pedido")
    private List<ItemPedidoCompraModel> itens;

    private BigDecimal valorTotal;
}

@Entity
@Table(name = "itensPedidoCompra")
class ItemPedidoCompraModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idItemPedidoCompra;

    @ManyToOne
    private PedidoCompraClienteModel pedido;

    @ManyToOne
    private ProdutosModel produto;

    private int quantidade;
    private BigDecimal custoUnitarioNaCompra;
}
