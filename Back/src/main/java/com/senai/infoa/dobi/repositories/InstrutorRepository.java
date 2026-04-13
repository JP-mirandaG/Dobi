package com.senai.infoa.dobi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.infoa.dobi.models.Instrutor;

@Repository
public interface InstrutorRepository extends JpaRepository<Instrutor, Integer> {

    @Query(value="select * from instrutor where email = :email and senha = :senha", nativeQuery=true)
    public Instrutor findByInstrutor(String email, String senha);
}
