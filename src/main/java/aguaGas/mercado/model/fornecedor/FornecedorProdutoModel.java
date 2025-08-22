package aguaGas.mercado.model.fornecedor;

import aguaGas.mercado.model.estoque.ProdutosModel;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "fornecedores_produtos", uniqueConstraints = @UniqueConstraint(columnNames = {"idProdutos", "idFornecedor"}))
public class FornecedorProdutoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFornecedorProduto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_produto")
    private ProdutosModel produto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_fornecedor")
    private FornecedoresModel fornecedor;

    /*--- informação de produto pelo fornecedor ---*/
    private String codigoProdutoNoFornecedor;
    private BigDecimal custoUnitario;
    private int prazoEntregaEmDias;
    private int quantidadeMinimaPedido;
    private LocalDate dataUltimaAtualizacaoPreco;
    private LocalDate precoMensal;
    private BigDecimal variacaoPrecoMensal;

    public FornecedorProdutoModel() {}

    public FornecedorProdutoModel(Long idFornecedorProduto, ProdutosModel produto, FornecedoresModel fornecedor, String codigoProdutoNoFornecedor, BigDecimal custoUnitario, int prazoEntregaEmDias, int quantidadeMinimaPedido, LocalDate dataUltimaAtualizacaoPreco, LocalDate precoMensal, BigDecimal variacaoPrecoMensal) {
        this.idFornecedorProduto = idFornecedorProduto;
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.codigoProdutoNoFornecedor = codigoProdutoNoFornecedor;
        this.custoUnitario = custoUnitario;
        this.prazoEntregaEmDias = prazoEntregaEmDias;
        this.quantidadeMinimaPedido = quantidadeMinimaPedido;
        this.dataUltimaAtualizacaoPreco = dataUltimaAtualizacaoPreco;
        this.precoMensal = precoMensal;
        this.variacaoPrecoMensal = variacaoPrecoMensal;
    }

    public Long getIdFornecedorProduto() {
        return idFornecedorProduto;
    }

    public void setIdFornecedorProduto(Long idFornecedorProduto) {
        this.idFornecedorProduto = idFornecedorProduto;
    }

    public ProdutosModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutosModel produto) {
        this.produto = produto;
    }

    public FornecedoresModel getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedoresModel fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCodigoProdutoNoFornecedor() {
        return codigoProdutoNoFornecedor;
    }

    public void setCodigoProdutoNoFornecedor(String codigoProdutoNoFornecedor) {
        this.codigoProdutoNoFornecedor = codigoProdutoNoFornecedor;
    }

    public BigDecimal getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitario(BigDecimal custoUnitario) {
        this.custoUnitario = custoUnitario;
    }

    public int getPrazoEntregaEmDias() {
        return prazoEntregaEmDias;
    }

    public void setPrazoEntregaEmDias(int prazoEntregaEmDias) {
        this.prazoEntregaEmDias = prazoEntregaEmDias;
    }

    public int getQuantidadeMinimaPedido() {
        return quantidadeMinimaPedido;
    }

    public void setQuantidadeMinimaPedido(int quantidadeMinimaPedido) {
        this.quantidadeMinimaPedido = quantidadeMinimaPedido;
    }

    public LocalDate getDataUltimaAtualizacaoPreco() {
        return dataUltimaAtualizacaoPreco;
    }

    public void setDataUltimaAtualizacaoPreco(LocalDate dataUltimaAtualizacaoPreco) {
        this.dataUltimaAtualizacaoPreco = dataUltimaAtualizacaoPreco;
    }

    public LocalDate getPrecoMensal() {
        return precoMensal;
    }

    public void setPrecoMensal(LocalDate precoMensal) {
        this.precoMensal = precoMensal;
    }

    public BigDecimal getVariacaoPrecoMensal() {
        return variacaoPrecoMensal;
    }

    public void setVariacaoPrecoMensal(BigDecimal variacaoPrecoMensal) {
        this.variacaoPrecoMensal = variacaoPrecoMensal;
    }
}
