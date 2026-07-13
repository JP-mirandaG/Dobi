package com.senai.infoa.dobi.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "atividade")
public class Atividade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atividade_id", nullable = false)
    private Integer id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "data_proposta", nullable = false)
    private LocalDate data_proposta;

    @Column(name = "data_entrega", nullable = false)
    private LocalDate data_entrega;

    @Column(name = "nota", nullable = false)
    private Double nota;

    @Column(name = "status", nullable = false)
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public Atividade() {
    }

    public Atividade(Integer id, String titulo, String descricao, LocalDate data_proposta, LocalDate data_entrega,
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

    public LocalDate getData_proposta() {
        return data_proposta;
    }

    public void setData_proposta(LocalDate data_proposta) {
        this.data_proposta = data_proposta;
    }

    public LocalDate getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(LocalDate data_entrega) {
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
