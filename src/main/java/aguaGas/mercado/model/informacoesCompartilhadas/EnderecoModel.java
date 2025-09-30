package aguaGas.mercado.model.informacoesCompartilhadas;

import aguaGas.mercado.dto.informacoesCompartilhadas.EnderecoDTO;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "endereco")
public class EnderecoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEndereco;

    private String estado;
    private String cidade;
    private String logradouro;
    private String cep;
    private String bairro;
    private Integer numeroLogradouro;
    private String complemento;
    private Boolean enderecoAtivo;

    public EnderecoModel() {}

    public EnderecoModel(Long idEndereco, String estado, String cidade, String logradouro, String cep, String bairro, Integer numeroLogradouro, String complemento, Boolean enderecoAtivo) {
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

    public void atualizarEnderecoComDTO(EnderecoDTO enderecoDTO) {
        if (enderecoDTO.getEstado() != null) {
            this.estado = enderecoDTO.getEstado();
        }
        if (enderecoDTO.getCidade() != null) {
            this.cidade = enderecoDTO.getCidade();
        }
        if (enderecoDTO.getLogradouro() != null) {
            this.logradouro = enderecoDTO.getLogradouro();
        }
        if (enderecoDTO.getCep() != null) {
            this.cep = enderecoDTO.getCep();
        }
        if (enderecoDTO.getBairro() != null) {
            this.bairro = enderecoDTO.getBairro();
        }
        if (enderecoDTO.getNumeroLogradouro() != null) {
            this.numeroLogradouro = enderecoDTO.getNumeroLogradouro();
        }
        if (enderecoDTO.getComplemento() != null) {
            this.complemento = enderecoDTO.getComplemento();
        }
        if (enderecoDTO.getEnderecoAtivo() != null) {
            this.enderecoAtivo = enderecoDTO.getEnderecoAtivo();
        }
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

    public Integer getNumeroLogradouro() {
        return numeroLogradouro;
    }

    public void setNumeroLogradouro(Integer numeroLogradouro) {
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
}
