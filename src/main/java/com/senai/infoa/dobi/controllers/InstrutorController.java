package com.senai.infoa.dobi.controllers;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

import com.senai.infoa.dobi.models.Instrutor;
import com.senai.infoa.dobi.services.InstrutorService;

@RestController
@RequestMapping("/instrutores")
public class InstrutorController {
    
    @Autowired
    private InstrutorService instrutorService;

     @PostMapping("/cadastrar")
    public Instrutor salvar(@RequestBody @NonNull Instrutor instrutor) {
        return instrutorService.salvar(instrutor);
    }

   @PostMapping("/login")
    public Instrutor login(@RequestParam String email, @RequestParam String senha) {
        return instrutorService.login(email, senha);
    }

     @PutMapping("/atualizar/{id}")
    public Instrutor atualizar(@PathVariable @NonNull Integer id, @RequestBody Instrutor instrutor) {
        return instrutorService.atualizar(instrutor, id);
        
    }

     @GetMapping("/buscar/{id}")
public ResponseEntity<?> buscar(@PathVariable @NonNull Integer id) {
    Instrutor instrutor = instrutorService.buscar(id);

    if (instrutor != null) {
        var resposta = Map.of(
            "mensagem", "instrutor " + id + " encontrado com sucesso",
            "Instrutor", instrutor
        );
        return ResponseEntity.ok(resposta);
    }

    return ResponseEntity.status(404).body("Falha ao buscar o instrutor");
}

    @DeleteMapping("/desativar/{email}")
    public Instrutor desativar(@PathVariable String email){

        return instrutorService.desativar(email);
    }

   
}
