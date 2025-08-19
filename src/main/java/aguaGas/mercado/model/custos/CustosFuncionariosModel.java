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
    private Long id_custos_funcionario;

    private String nome_funcionario;
    private BigDecimal salario_mensal_funcionario;
    private BigDecimal decimo_terceiro_salario_funcionario;
    private Date ferias_funcionario;
    private Time horario_de_trabalho_funcionario;

    public CustosFuncionariosModel() {}

    public CustosFuncionariosModel(Long id_custos_funcionario, String nome_funcionario, BigDecimal salario_mensal_funcionario, BigDecimal decimo_terceiro_salario_funcionario, Date ferias_funcionario, Time horario_de_trabalho_funcionario) {
        this.id_custos_funcionario = id_custos_funcionario;
        this.nome_funcionario = nome_funcionario;
        this.salario_mensal_funcionario = salario_mensal_funcionario;
        this.decimo_terceiro_salario_funcionario = decimo_terceiro_salario_funcionario;
        this.ferias_funcionario = ferias_funcionario;
        this.horario_de_trabalho_funcionario = horario_de_trabalho_funcionario;
    }

    public Long getId_custos_funcionario() {
        return id_custos_funcionario;
    }

    public void setId_custos_funcionario(Long id_custos_funcionario) {
        this.id_custos_funcionario = id_custos_funcionario;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public BigDecimal getSalario_mensal_funcionario() {
        return salario_mensal_funcionario;
    }

    public void setSalario_mensal_funcionario(BigDecimal salario_mensal_funcionario) {
        this.salario_mensal_funcionario = salario_mensal_funcionario;
    }

    public BigDecimal getDecimo_terceiro_salario_funcionario() {
        return decimo_terceiro_salario_funcionario;
    }

    public void setDecimo_terceiro_salario_funcionario(BigDecimal decimo_terceiro_salario_funcionario) {
        this.decimo_terceiro_salario_funcionario = decimo_terceiro_salario_funcionario;
    }

    public Date getFerias_funcionario() {
        return ferias_funcionario;
    }

    public void setFerias_funcionario(Date ferias_funcionario) {
        this.ferias_funcionario = ferias_funcionario;
    }

    public Time getHorario_de_trabalho_funcionario() {
        return horario_de_trabalho_funcionario;
    }

    public void setHorario_de_trabalho_funcionario(Time horario_de_trabalho_funcionario) {
        this.horario_de_trabalho_funcionario = horario_de_trabalho_funcionario;
    }
}
