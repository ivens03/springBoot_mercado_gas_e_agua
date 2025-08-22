package aguaGas.mercado.model.estoque;

import aguaGas.mercado.model.fornecedor.FornecedorProdutoModel;
import aguaGas.mercado.model.fornecedor.FornecedoresModel;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "produtos")
public class ProdutosModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProdutos;

    @ManyToOne
    @JoinColumn(name = "idFornecedor")
    private FornecedoresModel fornecedor;

    /*--- Informação base ---*/
    private String nomeProduto;
    private String descricaoProduto;
    private BigDecimal precoVenda;
    private int estoqueMinimo;
    private BigDecimal margemLucro;

    @OneToMany(mappedBy = "idFornecedorProduto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FornecedorProdutoModel> catalogoProdutos;

    public ProdutosModel() {}

    public ProdutosModel(Long idProdutos, FornecedoresModel fornecedor, String nomeProduto, String descricaoProduto, BigDecimal precoVenda, int estoqueMinimo, BigDecimal margemLucro, List<FornecedorProdutoModel> catalogoProdutos) {
        this.idProdutos = idProdutos;
        this.fornecedor = fornecedor;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoVenda = precoVenda;
        this.estoqueMinimo = estoqueMinimo;
        this.margemLucro = margemLucro;
        this.catalogoProdutos = catalogoProdutos;
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

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public BigDecimal getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(BigDecimal margemLucro) {
        this.margemLucro = margemLucro;
    }

    public List<FornecedorProdutoModel> getCatalogoProdutos() {
        return catalogoProdutos;
    }

    public void setCatalogoProdutos(List<FornecedorProdutoModel> catalogoProdutos) {
        this.catalogoProdutos = catalogoProdutos;
    }
}
