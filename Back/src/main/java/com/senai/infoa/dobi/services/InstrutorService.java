package com.senai.infoa.dobi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senai.infoa.dobi.repositories.InstrutorRepository;

@Service
public class InstrutorService {
    
    @Autowired
    private InstrutorRepository instrutorRepository;

public Instrutor salvar(Instrutor instrutor){
        return instrutorRepository.save(instrutor);
    }

    public List<Instrutor> listarTodos(){
        return instrutorRepository.findAll();
    }

      public boolean buscar(Integer id) {
        Instrutor instrutor = instrutorRepository.findById(id).get();
        if(instrutor != null){
           instrutorRepository.findById(id);
            return true;
  
        }

        return false;
    }

    public Instrutor atualizar(Instrutor instrutor, Integer id){
    Instrutor instrutor2 = instrutorRepository.findById(id).get();
    if(instrutor2 != null){
        Instrutor.setId(id);
        return instrutorRepository.save(instrutor);
    }
    return null;
}

 public boolean apagar(Integer id) {
        Instrutor instrutor = instrutorRepository.findById(id).get();
        if(Instrutor != null){
            instrutorRepository.deleteById(id);
            return true;
  
        }

        return false;
}
}
