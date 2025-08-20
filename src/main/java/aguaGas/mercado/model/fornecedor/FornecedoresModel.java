package aguaGas.mercado.model.fornecedor;

import aguaGas.mercado.model.informacoesCompartilhadas.EnderecoModel;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "fornecedores")
public class FornecedoresModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFornecedor;

    private String nomeFornecedor;
    private String cnpjFornecedor;
    private String telefoneFornecedor;
    private String emailFornecedor;
    private int prazoParaPagamento;
    private int prazoDeEntrega;
    private byte valorDoDesconto;
    private int quantidadeMinimaDoPedido;
    private String nomeProduto;
    private BigDecimal custoBrutoProdutos;
    private BigDecimal custoBrutoProdutoUnitario;
    private LocalDateTime diaRegistroDasInformacoes;

    private boolean fornecedorAtivo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idEndereco", referencedColumnName = "idEndereco")
    private EnderecoModel endereco;

    public FornecedoresModel() {}

    public FornecedoresModel(Long idFornecedor, String nomeFornecedor, String cnpjFornecedor, String telefoneFornecedor, String emailFornecedor, int prazoParaPagamento, int prazoDeEntrega, byte valorDoDesconto, int quantidadeMinimaDoPedido, String nomeProduto, BigDecimal custoBrutoProdutos, BigDecimal custoBrutoProdutoUnitario, LocalDateTime diaRegistroDasInformacoes, boolean fornecedorAtivo, EnderecoModel endereco) {
        this.idFornecedor = idFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        this.telefoneFornecedor = telefoneFornecedor;
        this.emailFornecedor = emailFornecedor;
        this.prazoParaPagamento = prazoParaPagamento;
        this.prazoDeEntrega = prazoDeEntrega;
        this.valorDoDesconto = valorDoDesconto;
        this.quantidadeMinimaDoPedido = quantidadeMinimaDoPedido;
        this.nomeProduto = nomeProduto;
        this.custoBrutoProdutos = custoBrutoProdutos;
        this.custoBrutoProdutoUnitario = custoBrutoProdutoUnitario;
        this.diaRegistroDasInformacoes = diaRegistroDasInformacoes;
        this.fornecedorAtivo = fornecedorAtivo;
        this.endereco = endereco;
    }

    public Long getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(String telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    public int getPrazoParaPagamento() {
        return prazoParaPagamento;
    }

    public void setPrazoParaPagamento(int prazoParaPagamento) {
        this.prazoParaPagamento = prazoParaPagamento;
    }

    public int getPrazoDeEntrega() {
        return prazoDeEntrega;
    }

    public void setPrazoDeEntrega(int prazoDeEntrega) {
        this.prazoDeEntrega = prazoDeEntrega;
    }

    public byte getValorDoDesconto() {
        return valorDoDesconto;
    }

    public void setValorDoDesconto(byte valorDoDesconto) {
        this.valorDoDesconto = valorDoDesconto;
    }

    public int getQuantidadeMinimaDoPedido() {
        return quantidadeMinimaDoPedido;
    }

    public void setQuantidadeMinimaDoPedido(int quantidadeMinimaDoPedido) {
        this.quantidadeMinimaDoPedido = quantidadeMinimaDoPedido;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getCustoBrutoProdutos() {
        return custoBrutoProdutos;
    }

    public void setCustoBrutoProdutos(BigDecimal custoBrutoProdutos) {
        this.custoBrutoProdutos = custoBrutoProdutos;
    }

    public BigDecimal getCustoBrutoProdutoUnitario() {
        return custoBrutoProdutoUnitario;
    }

    public void setCustoBrutoProdutoUnitario(BigDecimal custoBrutoProdutoUnitario) {
        this.custoBrutoProdutoUnitario = custoBrutoProdutoUnitario;
    }

    public LocalDateTime getDiaRegistroDasInformacoes() {
        return diaRegistroDasInformacoes;
    }

    public void setDiaRegistroDasInformacoes(LocalDateTime diaRegistroDasInformacoes) {
        this.diaRegistroDasInformacoes = diaRegistroDasInformacoes;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public boolean isFornecedorAtivo() {
        return fornecedorAtivo;
    }

    public void setFornecedorAtivo(boolean fornecedorAtivo) {
        this.fornecedorAtivo = fornecedorAtivo;
    }
}
