package aguaGas.mercado.model.funcionario;

import aguaGas.mercado.model.custos.CustosFuncionariosModel;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "funcionarios")
public class FuncionarioModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFuncionarios;

    /*--- informações funcionários ---*/
    private String nomeCompleto;
    private String cpf;
    private String cargo;
    private LocalDate dataAdmissao;
    private LocalDate dataDemissao;
    private Boolean funcionarioAtivo;

    @OneToMany(mappedBy = "idCustosFuncionario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CustosFuncionariosModel> historicoCustos;

    public FuncionarioModel () {}

    public FuncionarioModel(Long idFuncionarios, String nomeCompleto, String cpf, String cargo, LocalDate dataAdmissao, LocalDate dataDemissao, List<CustosFuncionariosModel> historicoCustos, Boolean funcionarioAtivo) {
        this.idFuncionarios = idFuncionarios;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
        this.historicoCustos = historicoCustos;
        this.funcionarioAtivo = funcionarioAtivo;
    }

    public Long getIdFuncionarios() {
        return idFuncionarios;
    }

    public void setIdFuncionarios(Long idFuncionarios) {
        this.idFuncionarios = idFuncionarios;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDate getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(LocalDate dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public List<CustosFuncionariosModel> getHistoricoCustos() {
        return historicoCustos;
    }

    public void setHistoricoCustos(List<CustosFuncionariosModel> historicoCustos) {
        this.historicoCustos = historicoCustos;
    }

    public Boolean getFuncionarioAtivo() {
        return funcionarioAtivo;
    }

    public void setFuncionarioAtivo(Boolean funcionarioAtivo) {
        this.funcionarioAtivo = funcionarioAtivo;
    }
}
