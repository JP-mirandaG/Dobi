package com.senai.infoa.dobi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.senai.infoa.dobi.models.Instrutor;
import com.senai.infoa.dobi.repositories.InstrutorRepository;

@Service
public class InstrutorService {
    
    @Autowired
    private InstrutorRepository instrutorRepository;

public Instrutor salvar(@NonNull Instrutor instrutor){
        return instrutorRepository.save(instrutor);
    }

    public List<Instrutor> listarTodos(){
        return instrutorRepository.findAll();
    }

      public boolean buscar(@NonNull   Integer id) {
        Instrutor instrutor = instrutorRepository.findById(id).get();
        if(instrutor != null){
           instrutorRepository.findById(id);
            return true;
  
        }

        return false;
    }

    public Instrutor login(String email, String senha){
        Instrutor instrutor = instrutorRepository.findByInstrutor(email, senha);
        if(instrutor != null && senha.equals(instrutor.getSenha())){
            return instrutor;
        }
        return null;
    }

    public Instrutor atualizar(Instrutor instrutor, @NonNull Integer id){
    Instrutor instrutor2 = instrutorRepository.findById(id).get();
    if(instrutor2 != null){
        instrutor.setId(id);
        return instrutorRepository.save(instrutor);
    }
    return null;
}

 public boolean apagar(@NonNull  Integer id) {
        Instrutor instrutor = instrutorRepository.findById(id).get();
        if(instrutor != null){
            instrutorRepository.deleteById(id);
            return true;
  
        }

        return false;
}
}
