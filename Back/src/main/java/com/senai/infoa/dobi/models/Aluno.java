package com.senai.infoa.dobi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "data de nascimento", nullable = false)
    private String dataDeNascimento;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "telefone", nullable = false)
    private String telefone;

    @Column(name = "matricula", nullable = false)
    private String matricula;

    @Column(name = "senha", nullable = false)
    private String senha;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    public Aluno() {
    }

    public Aluno(Integer id, String nome, String dataDeNascimento, String email, String telefone, String matricula,
            Turma turma) {
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.telefone = telefone;
        this.matricula = matricula;
        this.turma = turma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
