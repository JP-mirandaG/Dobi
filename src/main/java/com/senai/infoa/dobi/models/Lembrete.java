package com.senai.infoa.dobi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

import java.time.LocalDate;


import jakarta.persistence.Column;

@Entity
@Table(name="lembrete")
public class Lembrete {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Integer id;

    @Column(name="titulo", nullable = false)
    private String titulo;

    @Column(name="descricao", nullable = false)
    private String descricao;

    @Column(name = "data_postagem", nullable = false)
    private LocalDate dataPostagem;

    @Column(name = "data_retirada", nullable = false)
    private LocalDate dataRetirada;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    public Lembrete() {}

    public Lembrete(Integer id, String titulo, String descricao, LocalDate dataPostagem, LocalDate dataRetirada,
            Aluno aluno) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataPostagem = dataPostagem;
        this.dataRetirada = dataRetirada;
        this.aluno = aluno;
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

    public LocalDate getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(LocalDate dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    

}

