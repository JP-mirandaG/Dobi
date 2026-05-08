package com.senai.infoa.dobi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.senai.infoa.dobi.models.Turma;
import com.senai.infoa.dobi.repositories.TurmaRepository;

@Service
public class TurmaService {
    
    @Autowired
    private TurmaRepository turmaRepository;

public Turma salvar(@NonNull Turma turma){
        return turmaRepository.save(turma);
    }

    public List<Turma> listarTodos(){
        return turmaRepository.findAll();
    }

      public boolean buscar(@NonNull   Integer id) {
        Turma turma = turmaRepository.findById(id).get();
        if(turma != null){
           turmaRepository.findById(id);
            return true;
  
        }

        return false;
    }

    public Turma atualizar(Turma turma, @NonNull Integer id){
    Turma turma2 = turmaRepository.findById(id).get();
    if(turma2 != null){
        turma.setId(id);
        return turmaRepository.save(turma);
    }
    return null;
}

 public boolean apagar(@NonNull  Integer id) {
        Turma turma = turmaRepository.findById(id).get();
        if(turma != null){
            turmaRepository.deleteById(id);
            return true;
  
        }

        return false;
}
}
