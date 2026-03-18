package com.senai.infoa.dobi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senai.infoa.dobi.domain.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    
    
}
