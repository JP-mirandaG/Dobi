package com.senai.infoa.dobi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.dobi.models.Aluno;
import com.senai.infoa.dobi.services.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    
    @Autowired
    private AlunoService alunoService;

     @PostMapping("/cadastrar")
    public Aluno salvar(@RequestBody @NonNull Aluno aluno) {
        return alunoService.salvar(aluno);
    }

   @PostMapping("/login")
    public Aluno login(@RequestParam String cpf, @RequestParam String matricula) {
        return alunoService.login(cpf, matricula);
    }

     @PutMapping("/atualizar/{id}")
    public Aluno atualizar(@PathVariable @NonNull Integer id, @RequestBody Aluno aluno) {
        return alunoService.atualizar(aluno, id);
        
    }

    @GetMapping("/listar")
    public List<Aluno> listarTodos() {
        return alunoService.listarTodos();
    }

     @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable @NonNull Integer id) {
        boolean buscou = alunoService.buscar(id);
        if (buscou) {
            String texto = "Aluno " + id + "encontrado com sucesso";
            return texto;
        }
        return "Falha ao buscar o admin";
    }

    @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable @NonNull Integer id) {
        boolean deletou = alunoService.apagar(id);
        if (deletou) {
            return "Aluno removido com sucesso";
        }
        return "Falha ao remover o aluno";
    }
}
