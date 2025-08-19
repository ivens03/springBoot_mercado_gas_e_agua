package aguaGas.mercado.model.fornecedor;

import aguaGas.mercado.model.informacoesCompartilhadas.EnderecoModel;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "fornecedores")
public class FornecedoresModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_fornecedor;

    private String nome_fornecedor;
    private String cnpj_fornecedor;
    private String telefone_fornecedor;
    private String email_fornecedor;
    private int prazo_para_pagamento;
    private int prazo_de_entrega;
    private byte valor_do_desconto;
    private int quantidade_minima_do_pedido;
    private String nome_produto;
    private BigDecimal custo_bruto_produtos;
    private BigDecimal custo_bruto_produto_unitario;
    private LocalDateTime dia_registros_das_informacoes;
    private boolean fornecedor_ativo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco", referencedColumnName = "id_endereco")
    private EnderecoModel endereco;

    public FornecedoresModel() {}

    public FornecedoresModel(Long id_fornecedor, String nome_fornecedor, String cnpj_fornecedor, String telefone_fornecedor, String email_fornecedor, int prazo_para_pagamento, int prazo_de_entrega, byte valor_do_desconto, int quantidade_minima_do_pedido, String nome_produto, BigDecimal custo_bruto_produtos, BigDecimal custo_bruto_produto_unitario, EnderecoModel endereco, LocalDateTime dia_registros_das_informacoes, boolean fornecedor_ativo) {
        this.id_fornecedor = id_fornecedor;
        this.nome_fornecedor = nome_fornecedor;
        this.cnpj_fornecedor = cnpj_fornecedor;
        this.telefone_fornecedor = telefone_fornecedor;
        this.email_fornecedor = email_fornecedor;
        this.prazo_para_pagamento = prazo_para_pagamento;
        this.prazo_de_entrega = prazo_de_entrega;
        this.valor_do_desconto = valor_do_desconto;
        this.quantidade_minima_do_pedido = quantidade_minima_do_pedido;
        this.nome_produto = nome_produto;
        this.custo_bruto_produtos = custo_bruto_produtos;
        this.custo_bruto_produto_unitario = custo_bruto_produto_unitario;
        this.endereco = endereco;
        this.dia_registros_das_informacoes = dia_registros_das_informacoes;
        this.fornecedor_ativo = fornecedor_ativo;
    }

    public Long getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(Long id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    public void setNome_fornecedor(String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
    }

    public String getCnpj_fornecedor() {
        return cnpj_fornecedor;
    }

    public void setCnpj_fornecedor(String cnpj_fornecedor) {
        this.cnpj_fornecedor = cnpj_fornecedor;
    }

    public String getTelefone_fornecedor() {
        return telefone_fornecedor;
    }

    public void setTelefone_fornecedor(String telefone_fornecedor) {
        this.telefone_fornecedor = telefone_fornecedor;
    }

    public String getEmail_fornecedor() {
        return email_fornecedor;
    }

    public void setEmail_fornecedor(String email_fornecedor) {
        this.email_fornecedor = email_fornecedor;
    }

    public int getPrazo_para_pagamento() {
        return prazo_para_pagamento;
    }

    public void setPrazo_para_pagamento(int prazo_para_pagamento) {
        this.prazo_para_pagamento = prazo_para_pagamento;
    }

    public int getPrazo_de_entrega() {
        return prazo_de_entrega;
    }

    public void setPrazo_de_entrega(int prazo_de_entrega) {
        this.prazo_de_entrega = prazo_de_entrega;
    }

    public byte getValor_do_desconto() {
        return valor_do_desconto;
    }

    public void setValor_do_desconto(byte valor_do_desconto) {
        this.valor_do_desconto = valor_do_desconto;
    }

    public int getQuantidade_minima_do_pedido() {
        return quantidade_minima_do_pedido;
    }

    public void setQuantidade_minima_do_pedido(int quantidade_minima_do_pedido) {
        this.quantidade_minima_do_pedido = quantidade_minima_do_pedido;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public BigDecimal getCusto_bruto_produtos() {
        return custo_bruto_produtos;
    }

    public void setCusto_bruto_produtos(BigDecimal custo_bruto_produtos) {
        this.custo_bruto_produtos = custo_bruto_produtos;
    }

    public BigDecimal getCusto_bruto_produto_unitario() {
        return custo_bruto_produto_unitario;
    }

    public void setCusto_bruto_produto_unitario(BigDecimal custo_bruto_produto_unitario) {
        this.custo_bruto_produto_unitario = custo_bruto_produto_unitario;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public LocalDateTime getDia_registros_das_informacoes() {
        return dia_registros_das_informacoes;
    }

    public void setDia_registros_das_informacoes(LocalDateTime dia_registros_das_informacoes) {
        this.dia_registros_das_informacoes = dia_registros_das_informacoes;
    }

    public boolean isFornecedor_ativo() {
        return fornecedor_ativo;
    }

    public void setFornecedor_ativo(boolean fornecedor_ativo) {
        this.fornecedor_ativo = fornecedor_ativo;
    }
}
