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
    @Column(name="lembrete_id", nullable = false)
    private Integer id;

    @Column(name="titulo", nullable = false)
    private String titulo;

    @Column(name="descricao", nullable = false)
    private String descricao;

    @Column(name = "data_limite", nullable = false)
    private LocalDate dataLimite;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Lembrete() {}

    public Lembrete(Integer id, String titulo, String descricao, LocalDate dataLimite,
            Usuario usuario) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.usuario = usuario;
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

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    

}

