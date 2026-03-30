package com.senai.infoa.dobi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senai.infoa.dobi.entities.Instrutor;

@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor, Integer> {
    
}
