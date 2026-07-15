package com.senai.infoa.dobi.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.senai.infoa.dobi.models.Lembrete;
import com.senai.infoa.dobi.repositories.LembreteRepository;

@Service
public class LembreteService {
    
      @Autowired
    private LembreteRepository lembreteRepository;

public Lembrete salvar(@NonNull Lembrete lembrete){
        return lembreteRepository.save(lembrete);
    }

    public List<Lembrete> listarTodos(){
        return lembreteRepository.findAll();
    }

    public List<Lembrete> listarTodosPorDataId(Integer id, LocalDate data){
        return lembreteRepository.listarTodosPorDataId(id, data);
    }

    public Lembrete atualizar(Lembrete lembrete, @NonNull Integer id){
    Lembrete lembrete2 = lembreteRepository.findById(id).get();
    if(lembrete2 != null){
        lembrete.setId(id);
        return lembreteRepository.save(lembrete);
    }
    return null;
}

 public boolean apagar(@NonNull  Integer id) {
        Lembrete lembrete = lembreteRepository.findById(id).get();
        if(lembrete != null){
            lembreteRepository.deleteById(id);
            return true;
  
        }

        return false;
}

}
