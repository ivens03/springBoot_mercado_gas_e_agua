package aguaGas.mercado.dto.informacoesCompartilhadas;

import java.util.Objects;

public class EnderecoDTO {

    private Long idEndereco;
    private String estado;
    private String cidade;
    private String logradouro;
    private String cep;
    private String bairro;
    private int numeroLogradouro;
    private String complemento;
    private Boolean enderecoAtivo;

    public EnderecoDTO() {
    }

    public EnderecoDTO(Long idEndereco, String estado, String cidade, String logradouro, String cep, String bairro, int numeroLogradouro, String complemento, Boolean enderecoAtivo) {
        this.idEndereco = idEndereco;
        this.estado = estado;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.numeroLogradouro = numeroLogradouro;
        this.complemento = complemento;
        this.enderecoAtivo = enderecoAtivo;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumeroLogradouro() {
        return numeroLogradouro;
    }

    public void setNumeroLogradouro(int numeroLogradouro) {
        this.numeroLogradouro = numeroLogradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Boolean getEnderecoAtivo() {
        return enderecoAtivo;
    }

    public void setEnderecoAtivo(Boolean enderecoAtivo) {
        this.enderecoAtivo = enderecoAtivo;
    }

    @Override
    public String toString() {
        return "EnderecoDTO{" +
                "idEndereco=" + idEndereco +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numeroLogradouro=" + numeroLogradouro +
                ", complemento='" + complemento + '\'' +
                ", enderecoAtivo=" + enderecoAtivo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EnderecoDTO that = (EnderecoDTO) o;
        return numeroLogradouro == that.numeroLogradouro && Objects.equals(idEndereco, that.idEndereco) && Objects.equals(estado, that.estado) && Objects.equals(cidade, that.cidade) && Objects.equals(logradouro, that.logradouro) && Objects.equals(cep, that.cep) && Objects.equals(bairro, that.bairro) && Objects.equals(complemento, that.complemento) && Objects.equals(enderecoAtivo, that.enderecoAtivo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEndereco, estado, cidade, logradouro, cep, bairro, numeroLogradouro, complemento, enderecoAtivo);
    }
}
