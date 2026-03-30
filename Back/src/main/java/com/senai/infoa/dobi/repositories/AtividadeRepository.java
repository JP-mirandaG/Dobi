package com.senai.infoa.dobi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senai.infoa.dobi.entities.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Integer> {
    
}
