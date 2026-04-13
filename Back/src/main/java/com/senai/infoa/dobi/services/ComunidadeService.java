package com.senai.infoa.dobi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.dobi.models.Comunidade;
import com.senai.infoa.dobi.repositories.ComunidadeRepository;

@Service
public class ComunidadeService {
    
    @Autowired
    private ComunidadeRepository comunidadeRepository;

public Comunidade salvar(Comunidade comunidade){
        return comunidadeRepository.save(comunidade);
    }

    public List<Comunidade> listarTodos(){
        return comunidadeRepository.findAll();
    }

      public boolean buscar(Integer id) {
        Comunidade comunidade = comunidadeRepository.findById(id).get();
        if(comunidade != null){
           comunidadeRepository.findById(id);
            return true;
  
        }

        return false;
    }

    public Comunidade atualizar(Comunidade comunidade, Integer id){
    Comunidade comunidade2 = comunidadeRepository.findById(id).get();
    if(comunidade2 != null){
        comunidade.setId(id);
        return comunidadeRepository.save(comunidade);
    }
    return null;
}

 public boolean apagar(Integer id) {
        Comunidade comunidade = comunidadeRepository.findById(id).get();
        if(comunidade != null){
            comunidadeRepository.deleteById(id);
            return true;
  
        }

        return false;
}
}
