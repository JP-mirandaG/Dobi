package com.senai.infoa.dobi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.dobi.models.Atividade;
import com.senai.infoa.dobi.services.AtividadeService;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {
    
      @Autowired
    private AtividadeService atividadeService;

     @PostMapping("/cadastrar")
    public Atividade salvar(@RequestBody Atividade atividade) {
        return atividadeService.salvar(atividade);
    }


     @PutMapping("/atualizar/{id}")
    public Atividade atualizar(@PathVariable Integer id, @RequestBody Atividade atividade) {
        return atividadeService.atualizar(atividade, id);
        
    }

    @GetMapping("/listar")
    public List<Atividade> listarTodos() {
        return atividadeService.listarTodos();
    }

     @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable Integer id) {
        boolean buscou = atividadeService.buscar(id);
        if (buscou) {
            String texto = "Atividade " + id + " encontrada com sucesso";
            return texto;
        }
        return "Falha ao buscar a atividade";
    }

    @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable Integer id) {
        boolean deletou = atividadeService.apagar(id);
        if (deletou) {
            return "Atividade removida com sucesso";
        }
        return "Falha ao remover a atividade";
    }
}

