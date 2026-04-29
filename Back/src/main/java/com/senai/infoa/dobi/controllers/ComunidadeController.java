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

import com.senai.infoa.dobi.models.Comunidade;
import com.senai.infoa.dobi.services.ComunidadeService;

@RestController
@RequestMapping("/comunidades")
public class ComunidadeController {
    
      @Autowired
    private ComunidadeService comunidadeService;

     @PostMapping("/cadastrar")
    public Comunidade salvar(@RequestBody @NonNull Comunidade comunidade) {
        return comunidadeService.salvar(comunidade);
    }


     @PutMapping("/atualizar/{id}")
    public Comunidade atualizar(@PathVariable @NonNull Integer id, @RequestBody Comunidade comunidade) {
        return comunidadeService.atualizar(comunidade, id);
        
    }

    @GetMapping("/listar")
    public List<Comunidade> listarTodos() {
        return comunidadeService.listarTodos();
    }

     @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable @NonNull Integer id) {
        boolean buscou = comunidadeService.buscar(id);
        if (buscou) {
            String texto = "Comunidade " + id + " encontrada com sucesso";
            return texto;
        }
        return "Falha ao buscar a comunidade";
    }

    @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable @NonNull Integer id) {
        boolean deletou = comunidadeService.apagar(id);
        if (deletou) {
            return "Comunidade removida com sucesso";
        }
        return "Falha ao remover a comunidade";
    }
}
