package aguaGas.mercado.model.custos;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "custo_com_aluguel")
public class CustosAluguemModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCustoComAluguel;

    private Boolean pagaAluguel;
    private BigDecimal valorAluguel;
    private BigDecimal valorLuz;
    private BigDecimal valorAgua;
    private BigDecimal telefoneComNet;


    public CustosAluguemModel() {}

    public CustosAluguemModel(Long idCustoComAluguel, Boolean pagaAluguel, BigDecimal valorAluguel, BigDecimal valorLuz, BigDecimal valorAgua, BigDecimal telefoneComNet) {
        this.idCustoComAluguel = idCustoComAluguel;
        this.pagaAluguel = pagaAluguel;
        this.valorAluguel = valorAluguel;
        this.valorLuz = valorLuz;
        this.valorAgua = valorAgua;
        this.telefoneComNet = telefoneComNet;
    }

    public Long getIdCustoComAluguel() {
        return idCustoComAluguel;
    }

    public void setIdCustoComAluguel(Long idCustoComAluguel) {
        this.idCustoComAluguel = idCustoComAluguel;
    }

    public Boolean getPagaAluguel() {
        return pagaAluguel;
    }

    public void setPagaAluguel(Boolean pagaAluguel) {
        this.pagaAluguel = pagaAluguel;
    }

    public BigDecimal getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(BigDecimal valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public BigDecimal getValorLuz() {
        return valorLuz;
    }

    public void setValorLuz(BigDecimal valorLuz) {
        this.valorLuz = valorLuz;
    }

    public BigDecimal getValorAgua() {
        return valorAgua;
    }

    public void setValorAgua(BigDecimal valorAgua) {
        this.valorAgua = valorAgua;
    }

    public BigDecimal getTelefoneComNet() {
        return telefoneComNet;
    }

    public void setTelefoneComNet(BigDecimal telefoneComNet) {
        this.telefoneComNet = telefoneComNet;
    }
}
