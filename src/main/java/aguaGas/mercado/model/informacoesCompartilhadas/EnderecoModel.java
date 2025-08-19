package aguaGas.mercado.model.informacoesCompartilhadas;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "endereco")
public class EnderecoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_endereco;

    private String estado;
    private String cidade;
    private String logradouro;
    private String cep;
    private String bairro;
    private int numero_logradouro;
    private String complemento;
    private Boolean endereco_ativo;

    public EnderecoModel() {}

    public EnderecoModel(Long id_endereco, String estado, String cidade, String logradouro, String cep, String bairro, int numero_logradouro, String complemento, Boolean endereco_ativo) {
        this.id_endereco = id_endereco;
        this.estado = estado;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.numero_logradouro = numero_logradouro;
        this.complemento = complemento;
        this.endereco_ativo = endereco_ativo;
    }

    public Long getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Long id_endereco) {
        this.id_endereco = id_endereco;
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

    public int getNumero_logradouro() {
        return numero_logradouro;
    }

    public void setNumero_logradouro(int numero_logradouro) {
        this.numero_logradouro = numero_logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Boolean getEndereco_ativo() {
        return endereco_ativo;
    }

    public void setEndereco_ativo(Boolean endereco_ativo) {
        this.endereco_ativo = endereco_ativo;
    }
}
