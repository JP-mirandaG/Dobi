package com.senai.infoa.dobi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.dobi.repositories.AlunoRepository;

@Service
public class AlunoService {
    
    @Autowired
    private AlunoRepository alunoRepository;

public Aluno salvar(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public List<Aluno> listarTodos(){
        return alunoRepository.findAll();
    }

      public boolean buscar(Integer id) {
        Aluno aluno = alunoRepository.findById(id).get();
        if(aluno != null){
           alunoRepository.findById(id);
            return true;
  
        }

        return false;
    }

    public Aluno atualizar(Aluno aluno, Integer id){
    Aluno aluno2 = alunoRepository.findById(id).get();
    if(aluno2 != null){
        aluno.setId(id);
        return alunoRepository.save(aluno);
    }
    return null;
}

 public boolean apagar(Integer id) {
        Aluno aluno = alunoRepository.findById(id).get();
        if(aluno != null){
            alunoRepository.deleteById(id);
            return true;
  
        }

        return false;
}
}
