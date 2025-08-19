package aguaGas.mercado.model.cliente;

import aguaGas.mercado.model.fornecedor.FornecedoresModel;
import aguaGas.mercado.model.informacoesCompartilhadas.EnderecoModel;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "cliente")
public class ClienteModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_cliente;

    private String nome_cliente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
    private EnderecoModel endereco;

    private String telefone_cliente;

    public ClienteModel() {}

    public ClienteModel(Long id_cliente, String nome_cliente, EnderecoModel endereco, String telefone_cliente) {
        this.id_cliente = id_cliente;
        this.nome_cliente = nome_cliente;
        this.endereco = endereco;
        this.telefone_cliente = telefone_cliente;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public String getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(String telefone_cliente) {
        this.telefone_cliente = telefone_cliente;
    }
}
