package aguaGas.mercado.model.estoque;

import aguaGas.mercado.model.fornecedor.FornecedoresModel;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "produtos")
public class ProdutosModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_produtos;

    @ManyToOne
    @JoinColumn(name = "id_fornecedor")
    private FornecedoresModel fornecedor;

    private BigDecimal custos_para_valor_liquido;
    private BigDecimal preco_para_venda;
    private Byte valor_lucro_porcetagem;
    private int quantidade_produto_estoque;
    private int quantidade_solicitacao_reposicao;

    public ProdutosModel() {}

    public ProdutosModel(Long id_produtos, FornecedoresModel fornecedor, BigDecimal custos_para_valor_liquido, BigDecimal preco_para_venda, Byte valor_lucro_porcetagem, int quantidade_produto_estoque, int quantidade_solicitacao_reposicao) {
        this.id_produtos = id_produtos;
        this.fornecedor = fornecedor;
        this.custos_para_valor_liquido = custos_para_valor_liquido;
        this.preco_para_venda = preco_para_venda;
        this.valor_lucro_porcetagem = valor_lucro_porcetagem;
        this.quantidade_produto_estoque = quantidade_produto_estoque;
        this.quantidade_solicitacao_reposicao = quantidade_solicitacao_reposicao;
    }

    public Long getId_produtos() {
        return id_produtos;
    }

    public void setId_produtos(Long id_produtos) {
        this.id_produtos = id_produtos;
    }

    public FornecedoresModel getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedoresModel fornecedor) {
        this.fornecedor = fornecedor;
    }

    public BigDecimal getCustos_para_valor_liquido() {
        return custos_para_valor_liquido;
    }

    public void setCustos_para_valor_liquido(BigDecimal custos_para_valor_liquido) {
        this.custos_para_valor_liquido = custos_para_valor_liquido;
    }

    public BigDecimal getPreco_para_venda() {
        return preco_para_venda;
    }

    public void setPreco_para_venda(BigDecimal preco_para_venda) {
        this.preco_para_venda = preco_para_venda;
    }

    public Byte getValor_lucro_porcetagem() {
        return valor_lucro_porcetagem;
    }

    public void setValor_lucro_porcetagem(Byte valor_lucro_porcetagem) {
        this.valor_lucro_porcetagem = valor_lucro_porcetagem;
    }

    public int getQuantidade_produto_estoque() {
        return quantidade_produto_estoque;
    }

    public void setQuantidade_produto_estoque(int quantidade_produto_estoque) {
        this.quantidade_produto_estoque = quantidade_produto_estoque;
    }

    public int getQuantidade_solicitacao_reposicao() {
        return quantidade_solicitacao_reposicao;
    }

    public void setQuantidade_solicitacao_reposicao(int quantidade_solicitacao_reposicao) {
        this.quantidade_solicitacao_reposicao = quantidade_solicitacao_reposicao;
    }
}
