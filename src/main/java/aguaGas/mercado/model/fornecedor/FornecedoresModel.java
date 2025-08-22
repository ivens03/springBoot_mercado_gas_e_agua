package aguaGas.mercado.model.fornecedor;

import aguaGas.mercado.model.informacoesCompartilhadas.EnderecoModel;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "fornecedores")
public class FornecedoresModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFornecedor;

    /*--- Dados do fornecedor ---*/
    private String nomeFornecedor;
    private String cnpjFornecedor;
    private String telefoneFornecedor;
    private String emailFornecedor;
    private boolean fornecedorAtivo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idEndereco", referencedColumnName = "idEndereco")
    private EnderecoModel endereco;

    public FornecedoresModel() {}

    public FornecedoresModel(Long idFornecedor, String nomeFornecedor, String cnpjFornecedor, String telefoneFornecedor, String emailFornecedor, boolean fornecedorAtivo, EnderecoModel endereco) {
        this.idFornecedor = idFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        this.telefoneFornecedor = telefoneFornecedor;
        this.emailFornecedor = emailFornecedor;
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

    public boolean isFornecedorAtivo() {
        return fornecedorAtivo;
    }

    public void setFornecedorAtivo(boolean fornecedorAtivo) {
        this.fornecedorAtivo = fornecedorAtivo;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }
}
