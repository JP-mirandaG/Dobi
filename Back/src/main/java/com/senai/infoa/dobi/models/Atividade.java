package com.senai.infoa.dobi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "atividade")
public class Atividade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_proposta")
    private String data_proposta;

    @Column(name = "data_entrega")
    private String data_entrega;

    @Column(name = "nota")
    private Double nota;

    @Column(name = "status")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public Atividade() {
    }

    public Atividade(Integer id, String titulo, String descricao, String data_proposta, String data_entrega,
            Double nota, Boolean status, Turma turma) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data_proposta = data_proposta;
        this.data_entrega = data_entrega;
        this.nota = nota;
        this.status = status;
        this.turma = turma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_proposta() {
        return data_proposta;
    }

    public void setData_proposta(String data_proposta) {
        this.data_proposta = data_proposta;
    }

    public String getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    
}
