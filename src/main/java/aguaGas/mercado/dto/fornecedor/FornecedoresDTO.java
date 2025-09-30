package aguaGas.mercado.dto.fornecedor;

import aguaGas.mercado.model.informacoesCompartilhadas.EnderecoModel;

import java.util.Objects;

public class FornecedoresDTO {

    private Long idFornecedor;
    private String nomeFornecedor;
    private String cnpjFornecedor;
    private String telefoneFornecedor;
    private String emailFornecedor;
    private boolean fornecedorAtivo;
    private EnderecoModel endereco;

    public FornecedoresDTO() {
    }

    public FornecedoresDTO(Long idFornecedor, String nomeFornecedor, String cnpjFornecedor, String telefoneFornecedor, String emailFornecedor, boolean fornecedorAtivo, EnderecoModel endereco) {
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

    @Override
    public String toString() {
        return "FornecedoresDTO{" +
                "idFornecedor=" + idFornecedor +
                ", nomeFornecedor='" + nomeFornecedor + '\'' +
                ", cnpjFornecedor='" + cnpjFornecedor + '\'' +
                ", telefoneFornecedor='" + telefoneFornecedor + '\'' +
                ", emailFornecedor='" + emailFornecedor + '\'' +
                ", fornecedorAtivo=" + fornecedorAtivo +
                ", endereco=" + endereco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FornecedoresDTO that = (FornecedoresDTO) o;
        return fornecedorAtivo == that.fornecedorAtivo && Objects.equals(idFornecedor, that.idFornecedor) && Objects.equals(nomeFornecedor, that.nomeFornecedor) && Objects.equals(cnpjFornecedor, that.cnpjFornecedor) && Objects.equals(telefoneFornecedor, that.telefoneFornecedor) && Objects.equals(emailFornecedor, that.emailFornecedor) && Objects.equals(endereco, that.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFornecedor, nomeFornecedor, cnpjFornecedor, telefoneFornecedor, emailFornecedor, fornecedorAtivo, endereco);
    }
}
