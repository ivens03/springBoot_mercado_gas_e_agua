package aguaGas.mercado.model.pedidos;

import aguaGas.mercado.model.cliente.ClienteModel;
import aguaGas.mercado.model.estoque.ProdutosModel;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "pedidos")
public class PedidoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPedido;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "idFornecedor", nullable = false)
    private ProdutosModel produto;

    private Byte quantidade;
    private String modoPagamento;
    private BigDecimal valorPagamento;
    private BigDecimal valorTroco;


    public PedidoModel() {}

    public PedidoModel(Long idPedido, ClienteModel cliente, ProdutosModel produto, Byte quantidade, String modoPagamento, BigDecimal valorPagamento, BigDecimal valorTroco) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.modoPagamento = modoPagamento;
        this.valorPagamento = valorPagamento;
        this.valorTroco = valorTroco;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public ProdutosModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutosModel produto) {
        this.produto = produto;
    }

    public Byte getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Byte quantidade) {
        this.quantidade = quantidade;
    }

    public String getModoPagamento() {
        return modoPagamento;
    }

    public void setModoPagamento(String modoPagamento) {
        this.modoPagamento = modoPagamento;
    }

    public BigDecimal getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(BigDecimal valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public BigDecimal getValorTroco() {
        return valorTroco;
    }

    public void setValorTroco(BigDecimal valorTroco) {
        this.valorTroco = valorTroco;
    }
}
