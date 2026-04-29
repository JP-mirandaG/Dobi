package com.senai.infoa.dobi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.dobi.models.Lembrete;

@Repository
public interface LembreteRepository extends JpaRepository<Lembrete, Integer>{

    

    
}
