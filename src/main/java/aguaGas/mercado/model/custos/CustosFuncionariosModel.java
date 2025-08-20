package aguaGas.mercado.model.custos;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "custos_com_funcionarios")
public class CustosFuncionariosModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCustosFuncionario;

    private String nomeFuncionario;
    private BigDecimal salarioMensalFuncionario;
    private BigDecimal decimoTerceiroSalarioFuncionario;
    private Date feriasFuncionario;
    private Time horarioDeTrabalhoFuncionario;


    public CustosFuncionariosModel() {}

    public CustosFuncionariosModel(Long idCustosFuncionario, String nomeFuncionario, BigDecimal salarioMensalFuncionario, BigDecimal decimoTerceiroSalarioFuncionario, Date feriasFuncionario, Time horarioDeTrabalhoFuncionario) {
        this.idCustosFuncionario = idCustosFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.salarioMensalFuncionario = salarioMensalFuncionario;
        this.decimoTerceiroSalarioFuncionario = decimoTerceiroSalarioFuncionario;
        this.feriasFuncionario = feriasFuncionario;
        this.horarioDeTrabalhoFuncionario = horarioDeTrabalhoFuncionario;
    }

    public Long getIdCustosFuncionario() {
        return idCustosFuncionario;
    }

    public void setIdCustosFuncionario(Long idCustosFuncionario) {
        this.idCustosFuncionario = idCustosFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public BigDecimal getSalarioMensalFuncionario() {
        return salarioMensalFuncionario;
    }

    public void setSalarioMensalFuncionario(BigDecimal salarioMensalFuncionario) {
        this.salarioMensalFuncionario = salarioMensalFuncionario;
    }

    public BigDecimal getDecimoTerceiroSalarioFuncionario() {
        return decimoTerceiroSalarioFuncionario;
    }

    public void setDecimoTerceiroSalarioFuncionario(BigDecimal decimoTerceiroSalarioFuncionario) {
        this.decimoTerceiroSalarioFuncionario = decimoTerceiroSalarioFuncionario;
    }

    public Date getFeriasFuncionario() {
        return feriasFuncionario;
    }

    public void setFeriasFuncionario(Date feriasFuncionario) {
        this.feriasFuncionario = feriasFuncionario;
    }

    public Time getHorarioDeTrabalhoFuncionario() {
        return horarioDeTrabalhoFuncionario;
    }

    public void setHorarioDeTrabalhoFuncionario(Time horarioDeTrabalhoFuncionario) {
        this.horarioDeTrabalhoFuncionario = horarioDeTrabalhoFuncionario;
    }
}
