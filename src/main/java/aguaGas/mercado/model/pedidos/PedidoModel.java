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
    private Long id_pedido;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "id_fornecedor", nullable = false)
    private ProdutosModel produto;

    private Byte quantidade;
    private String modo_pagamento;
    private BigDecimal valor_pagamento;
    private BigDecimal valor_troco;

    public PedidoModel() {}

    public PedidoModel(Long id_pedido, ClienteModel cliente, ProdutosModel produto, Byte quantidade, String modo_pagamento, BigDecimal valor_pagamento, BigDecimal valor_troco) {
        this.id_pedido = id_pedido;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.modo_pagamento = modo_pagamento;
        this.valor_pagamento = valor_pagamento;
        this.valor_troco = valor_troco;
    }

    public Long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Long id_pedido) {
        this.id_pedido = id_pedido;
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

    public String getModo_pagamento() {
        return modo_pagamento;
    }

    public void setModo_pagamento(String modo_pagamento) {
        this.modo_pagamento = modo_pagamento;
    }

    public BigDecimal getValor_pagamento() {
        return valor_pagamento;
    }

    public void setValor_pagamento(BigDecimal valor_pagamento) {
        this.valor_pagamento = valor_pagamento;
    }

    public BigDecimal getValor_troco() {
        return valor_troco;
    }

    public void setValor_troco(BigDecimal valor_troco) {
        this.valor_troco = valor_troco;
    }
}
