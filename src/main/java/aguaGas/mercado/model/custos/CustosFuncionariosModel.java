package aguaGas.mercado.model.custos;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "custos_com_funcionarios")
public class CustosFuncionariosModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCustosFuncionario;
    
    /* --- Base de Cálculo para o Mês --- */
    private BigDecimal salarioBaseNoMes;
    private int diasTrabalhados;
    private int diasFaltaNaoJustificada;
    private int diasAbonados;

    /*  --- Custos Diretos (Salário e Benefícios) --- */
    private BigDecimal valorSalarioProporcional;
    private BigDecimal valorValeTransporte;
    private BigDecimal valorValeRefeicaoAlimentacao;
    private BigDecimal valorPlanoSaude;
    private BigDecimal horaExtra;

    /* --- Encargos e Provisões --- */
    private BigDecimal valorFgts; // Geralmente 8% sobre o salário
    private BigDecimal valorInssPatronal; // Geralmente entre 7,5% a 9% do salário
    private BigDecimal provisaoDecimoTerceiro; // 1/12 do custo total
    private BigDecimal provisaoFerias; // 1/12 do salário
    private BigDecimal provisaoTercoFerias; // 1/3 da provisão de férias

    /*--- Totalizador ---*/
    private BigDecimal custoTotalPorFuncionario;

    public CustosFuncionariosModel() {}

    public CustosFuncionariosModel(Long idCustosFuncionario, BigDecimal salarioBaseNoMes, int diasTrabalhados, int diasFaltaNaoJustificada, int diasAbonados, BigDecimal valorSalarioProporcional, BigDecimal valorValeTransporte, BigDecimal valorValeRefeicaoAlimentacao, BigDecimal valorPlanoSaude, BigDecimal horaExtra, BigDecimal valorFgts, BigDecimal valorInssPatronal, BigDecimal provisaoDecimoTerceiro, BigDecimal provisaoFerias, BigDecimal provisaoTercoFerias, BigDecimal custoTotalPorFuncionario) {
        this.idCustosFuncionario = idCustosFuncionario;
        this.salarioBaseNoMes = salarioBaseNoMes;
        this.diasTrabalhados = diasTrabalhados;
        this.diasFaltaNaoJustificada = diasFaltaNaoJustificada;
        this.diasAbonados = diasAbonados;
        this.valorSalarioProporcional = valorSalarioProporcional;
        this.valorValeTransporte = valorValeTransporte;
        this.valorValeRefeicaoAlimentacao = valorValeRefeicaoAlimentacao;
        this.valorPlanoSaude = valorPlanoSaude;
        this.horaExtra = horaExtra;
        this.valorFgts = valorFgts;
        this.valorInssPatronal = valorInssPatronal;
        this.provisaoDecimoTerceiro = provisaoDecimoTerceiro;
        this.provisaoFerias = provisaoFerias;
        this.provisaoTercoFerias = provisaoTercoFerias;
        this.custoTotalPorFuncionario = custoTotalPorFuncionario;
    }

    public Long getIdCustosFuncionario() {
        return idCustosFuncionario;
    }

    public void setIdCustosFuncionario(Long idCustosFuncionario) {
        this.idCustosFuncionario = idCustosFuncionario;
    }

    public BigDecimal getSalarioBaseNoMes() {
        return salarioBaseNoMes;
    }

    public void setSalarioBaseNoMes(BigDecimal salarioBaseNoMes) {
        this.salarioBaseNoMes = salarioBaseNoMes;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public int getDiasFaltaNaoJustificada() {
        return diasFaltaNaoJustificada;
    }

    public void setDiasFaltaNaoJustificada(int diasFaltaNaoJustificada) {
        this.diasFaltaNaoJustificada = diasFaltaNaoJustificada;
    }

    public int getDiasAbonados() {
        return diasAbonados;
    }

    public void setDiasAbonados(int diasAbonados) {
        this.diasAbonados = diasAbonados;
    }

    public BigDecimal getValorSalarioProporcional() {
        return valorSalarioProporcional;
    }

    public void setValorSalarioProporcional(BigDecimal valorSalarioProporcional) {
        this.valorSalarioProporcional = valorSalarioProporcional;
    }

    public BigDecimal getValorValeTransporte() {
        return valorValeTransporte;
    }

    public void setValorValeTransporte(BigDecimal valorValeTransporte) {
        this.valorValeTransporte = valorValeTransporte;
    }

    public BigDecimal getValorValeRefeicaoAlimentacao() {
        return valorValeRefeicaoAlimentacao;
    }

    public void setValorValeRefeicaoAlimentacao(BigDecimal valorValeRefeicaoAlimentacao) {
        this.valorValeRefeicaoAlimentacao = valorValeRefeicaoAlimentacao;
    }

    public BigDecimal getValorPlanoSaude() {
        return valorPlanoSaude;
    }

    public void setValorPlanoSaude(BigDecimal valorPlanoSaude) {
        this.valorPlanoSaude = valorPlanoSaude;
    }

    public BigDecimal getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(BigDecimal horaExtra) {
        this.horaExtra = horaExtra;
    }

    public BigDecimal getValorFgts() {
        return valorFgts;
    }

    public void setValorFgts(BigDecimal valorFgts) {
        this.valorFgts = valorFgts;
    }

    public BigDecimal getValorInssPatronal() {
        return valorInssPatronal;
    }

    public void setValorInssPatronal(BigDecimal valorInssPatronal) {
        this.valorInssPatronal = valorInssPatronal;
    }

    public BigDecimal getProvisaoDecimoTerceiro() {
        return provisaoDecimoTerceiro;
    }

    public void setProvisaoDecimoTerceiro(BigDecimal provisaoDecimoTerceiro) {
        this.provisaoDecimoTerceiro = provisaoDecimoTerceiro;
    }

    public BigDecimal getProvisaoFerias() {
        return provisaoFerias;
    }

    public void setProvisaoFerias(BigDecimal provisaoFerias) {
        this.provisaoFerias = provisaoFerias;
    }

    public BigDecimal getProvisaoTercoFerias() {
        return provisaoTercoFerias;
    }

    public void setProvisaoTercoFerias(BigDecimal provisaoTercoFerias) {
        this.provisaoTercoFerias = provisaoTercoFerias;
    }

    public BigDecimal getCustoTotalPorFuncionario() {
        return custoTotalPorFuncionario;
    }

    public void setCustoTotalPorFuncionario(BigDecimal custoTotalPorFuncionario) {
        this.custoTotalPorFuncionario = custoTotalPorFuncionario;
    }
}
