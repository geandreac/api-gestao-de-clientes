package com.fametro.gestao_de_clientes.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "historicoInteracoes")
public class HistoricoInteracoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date data;
    private String tipo;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "clientes_id")
    private Clientes clientes;

    public HistoricoInteracoes() {
    }

    public HistoricoInteracoes(Date data, String tipo, String descricao, Clientes clientes) {
        this.data = data;
        this.tipo = tipo;
        this.descricao = descricao;
        this.clientes = clientes;
    }

    public Long getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
}
