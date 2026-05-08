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
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.dobi.models.Turma;
import com.senai.infoa.dobi.services.TurmaService;

@RestController
@RequestMapping("/turmas")
public class TurmaController {
    
      @Autowired
    private TurmaService turmaService;

     @PostMapping("/cadastrar")
    public Turma salvar(@RequestBody @NonNull Turma turma) {
        return turmaService.salvar(turma);
    }


     @PutMapping("/atualizar/{id}")
    public Turma atualizar(@PathVariable @NonNull Integer id, @RequestBody Turma turma) {
        return turmaService.atualizar(turma, id);
        
    }

    @GetMapping("/listar")
    public List<Turma> listarTodos() {
        return turmaService.listarTodos();
    }

     @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable @NonNull Integer id) {
        boolean buscou = turmaService.buscar(id);
        if (buscou) {
            String texto = "Turma " + id + " encontrada com sucesso";
            return texto;
        }
        return "Falha ao buscar a turma";
    }

    @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable @NonNull Integer id) {
        boolean deletou = turmaService.apagar(id);
        if (deletou) {
            return "Turma removida com sucesso";
        }
        return "Falha ao remover a turma";
    }
}
