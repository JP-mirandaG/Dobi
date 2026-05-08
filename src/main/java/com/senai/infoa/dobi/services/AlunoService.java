package com.senai.infoa.dobi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.senai.infoa.dobi.models.Aluno;
import com.senai.infoa.dobi.repositories.AlunoRepository;

@Service
public class AlunoService {
    
    @Autowired
    private AlunoRepository alunoRepository;

public Aluno salvar(@NonNull Aluno aluno){
    if(aluno != null) {}
        return alunoRepository.save(aluno);
    }

    public List<Aluno> listarTodos(){
        return alunoRepository.findAll();
    }

      public boolean buscar(@NonNull   Integer id) {
        Aluno aluno = alunoRepository.findById(id).get();
        if(aluno != null){
           alunoRepository.findById(id);
            return true;
  
        }

        return false;
    }

     public Aluno login(String email, String senha){
        Aluno aluno = alunoRepository.findByAluno(email, senha);
        if(aluno != null && senha.equals(aluno.getSenha())){
            return aluno;
        }
        return null;
    }

    public Aluno atualizar(Aluno aluno, @NonNull Integer id){
    Aluno aluno2 = alunoRepository.findById(id).get();
    if(aluno2 != null){
        aluno.setId(id);
        return alunoRepository.save(aluno);
    }
    return null;
}

 public boolean apagar(@NonNull  Integer id) {
        Aluno aluno = alunoRepository.findById(id).get();
        if(aluno != null){
            alunoRepository.deleteById(id);
            return true;
  
        }

        return false;
}
}
