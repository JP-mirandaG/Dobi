package com.senai.infoa.dobi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.dobi.models.Atividade;
import com.senai.infoa.dobi.repositories.AtividadeRepository;

@Service
public class AtividadeService {
    
    @Autowired
    private AtividadeRepository atividadeRepository;

public Atividade salvar(Atividade atividade){
        return atividadeRepository.save(atividade);
    }

    public List<Atividade> listarTodos(){
        return atividadeRepository.findAll();
    }

      public boolean buscar(Integer id) {
        Atividade atividade = atividadeRepository.findById(id).get();
        if(atividade != null){
           atividadeRepository.findById(id);
            return true;
  
        }

        return false;
    }

    public Atividade atualizar(Atividade atividade, Integer id){
    Atividade atividade2 = atividadeRepository.findById(id).get();
    if(atividade2 != null){
        atividade.setId(id);
        return atividadeRepository.save(atividade);
    }
    return null;
}

 public boolean apagar(Integer id) {
        Atividade atividade = atividadeRepository.findById(id).get();
        if(atividade != null){
            atividadeRepository.deleteById(id);
            return true;
  
        }

        return false;
}
}
