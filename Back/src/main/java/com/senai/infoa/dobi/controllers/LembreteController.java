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

import com.senai.infoa.dobi.models.Lembrete;
import com.senai.infoa.dobi.services.LembreteService;

@RestController
@RequestMapping("/lembrete")
public class LembreteController {
    
      @Autowired
    private LembreteService lembreteService;

     @PostMapping("/cadastrar")
    public Lembrete salvar(@RequestBody @NonNull Lembrete lembrete) {
        return lembreteService.salvar(lembrete);
    }


     @PutMapping("/atualizar/{id}")
    public Lembrete atualizar(@PathVariable @NonNull Integer id, @RequestBody Lembrete lembrete) {
        return lembreteService.atualizar(lembrete, id);
        
    }

    @GetMapping("/listar")
    public List<Lembrete> listarTodos() {
        return lembreteService.listarTodos();
    }

     @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable @NonNull Integer id) {
        boolean buscou = lembreteService.buscar(id);
        if (buscou) {
            String texto = "Turma " + id + " encontrada com sucesso";
            return texto;
        }
        return "Falha ao buscar a turma";
    }

    @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable @NonNull Integer id) {
        boolean deletou = lembreteService.apagar(id);
        if (deletou) {
            return "Turma removida com sucesso";
        }
        return "Falha ao remover a turma";
    }
}
