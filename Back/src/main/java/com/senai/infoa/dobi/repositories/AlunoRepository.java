package com.senai.infoa.dobi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.infoa.dobi.models.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    
    @Query(value="select * from aluno where email = :email and senha = :senha", nativeQuery=true)
    public Aluno findByAluno(String email, String senha);
}
