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
    private Long idProdutos;

    @ManyToOne
    @JoinColumn(name = "idFornecedor")
    private FornecedoresModel fornecedor;

    private BigDecimal custosParaValorLiquido;
    private BigDecimal precoParaVenda;
    private Byte valorLucroPorcetagem;
    private int quantidadeProdutoEstoque;
    private int quantidadeSolicitacaoReposicao;

    public ProdutosModel() {}

    public ProdutosModel(Long idProdutos, FornecedoresModel fornecedor, BigDecimal custosParaValorLiquido, BigDecimal precoParaVenda, Byte valorLucroPorcetagem, int quantidadeProdutoEstoque, int quantidadeSolicitacaoReposicao) {
        this.idProdutos = idProdutos;
        this.fornecedor = fornecedor;
        this.custosParaValorLiquido = custosParaValorLiquido;
        this.precoParaVenda = precoParaVenda;
        this.valorLucroPorcetagem = valorLucroPorcetagem;
        this.quantidadeProdutoEstoque = quantidadeProdutoEstoque;
        this.quantidadeSolicitacaoReposicao = quantidadeSolicitacaoReposicao;
    }

    public Long getIdProdutos() {
        return idProdutos;
    }

    public void setIdProdutos(Long idProdutos) {
        this.idProdutos = idProdutos;
    }

    public FornecedoresModel getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedoresModel fornecedor) {
        this.fornecedor = fornecedor;
    }

    public BigDecimal getCustosParaValorLiquido() {
        return custosParaValorLiquido;
    }

    public void setCustosParaValorLiquido(BigDecimal custosParaValorLiquido) {
        this.custosParaValorLiquido = custosParaValorLiquido;
    }

    public BigDecimal getPrecoParaVenda() {
        return precoParaVenda;
    }

    public void setPrecoParaVenda(BigDecimal precoParaVenda) {
        this.precoParaVenda = precoParaVenda;
    }

    public Byte getValorLucroPorcetagem() {
        return valorLucroPorcetagem;
    }

    public void setValorLucroPorcetagem(Byte valorLucroPorcetagem) {
        this.valorLucroPorcetagem = valorLucroPorcetagem;
    }

    public int getQuantidadeProdutoEstoque() {
        return quantidadeProdutoEstoque;
    }

    public void setQuantidadeProdutoEstoque(int quantidadeProdutoEstoque) {
        this.quantidadeProdutoEstoque = quantidadeProdutoEstoque;
    }

    public int getQuantidadeSolicitacaoReposicao() {
        return quantidadeSolicitacaoReposicao;
    }

    public void setQuantidadeSolicitacaoReposicao(int quantidadeSolicitacaoReposicao) {
        this.quantidadeSolicitacaoReposicao = quantidadeSolicitacaoReposicao;
    }
}
