package aguaGas.mercado.model.custos;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "custo_com_aluguel")
public class CustosAluguemModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_custo_com_aluguel;

    private Boolean paga_aluguel;
    private BigDecimal valor_aluguel;
    private BigDecimal valor_luz;
    private BigDecimal valor_agua;
    private BigDecimal telefone_com_net;

    public CustosAluguemModel() {}

    public CustosAluguemModel(Long id_custo_com_aluguel, Boolean paga_aluguel, BigDecimal valor_aluguel, BigDecimal valor_luz, BigDecimal valor_agua, BigDecimal telefone_com_net) {
        this.id_custo_com_aluguel = id_custo_com_aluguel;
        this.paga_aluguel = paga_aluguel;
        this.valor_aluguel = valor_aluguel;
        this.valor_luz = valor_luz;
        this.valor_agua = valor_agua;
        this.telefone_com_net = telefone_com_net;
    }

    public Long getId_custo_com_aluguel() {
        return id_custo_com_aluguel;
    }

    public void setId_custo_com_aluguel(Long id_custo_com_aluguel) {
        this.id_custo_com_aluguel = id_custo_com_aluguel;
    }

    public Boolean getPaga_aluguel() {
        return paga_aluguel;
    }

    public void setPaga_aluguel(Boolean paga_aluguel) {
        this.paga_aluguel = paga_aluguel;
    }

    public BigDecimal getValor_aluguel() {
        return valor_aluguel;
    }

    public void setValor_aluguel(BigDecimal valor_aluguel) {
        this.valor_aluguel = valor_aluguel;
    }

    public BigDecimal getValor_luz() {
        return valor_luz;
    }

    public void setValor_luz(BigDecimal valor_luz) {
        this.valor_luz = valor_luz;
    }

    public BigDecimal getValor_agua() {
        return valor_agua;
    }

    public void setValor_agua(BigDecimal valor_agua) {
        this.valor_agua = valor_agua;
    }

    public BigDecimal getTelefone_com_net() {
        return telefone_com_net;
    }

    public void setTelefone_com_net(BigDecimal telefone_com_net) {
        this.telefone_com_net = telefone_com_net;
    }
}
