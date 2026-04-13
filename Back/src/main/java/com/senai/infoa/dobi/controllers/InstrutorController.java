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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.dobi.models.Instrutor;
import com.senai.infoa.dobi.services.InstrutorService;

@RestController
@RequestMapping("/instrutores")
public class InstrutorController {
    
    @Autowired
    private InstrutorService instrutorService;

     @PostMapping("/cadastrar")
    public Instrutor salvar(@RequestBody Instrutor instrutor) {
        return instrutorService.salvar(instrutor);
    }

   @PostMapping("/login")
    public Instrutor login(@RequestParam String cpf, @RequestParam String matricula) {
        return instrutorService.login(cpf, matricula);
    }

     @PutMapping("/atualizar/{id}")
    public Instrutor atualizar(@PathVariable Integer id, @RequestBody Instrutor instrutor) {
        return instrutorService.atualizar(instrutor, id);
        
    }

    @GetMapping("/listar")
    public List<Instrutor> listarTodos() {
        return instrutorService.listarTodos();
    }

     @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable Integer id) {
        boolean buscou = instrutorService.buscar(id);
        if (buscou) {
            String texto = "Instrutor " + id + " encontrado com sucesso";
            return texto;
        }
        return "Falha ao buscar o instrutor";
    }

    @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable Integer id) {
        boolean deletou = instrutorService.apagar(id);
        if (deletou) {
            return "Instrutor removido com sucesso";
        }
        return "Falha ao remover o instrutor";
    }
}
