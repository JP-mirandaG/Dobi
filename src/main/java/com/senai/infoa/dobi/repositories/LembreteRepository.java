package com.senai.infoa.dobi.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.infoa.dobi.models.Lembrete;

@Repository
public interface LembreteRepository extends JpaRepository<Lembrete, Integer>{

    @Query(value="select * from usuario u inner join lembrete l on l.usuario_id = u.usuario_id where u.usuario_id = :id and l.data_limite = :data;", nativeQuery=true)
    List<Lembrete> listarTodosPorDataId(Integer id, LocalDate data);
    
}
