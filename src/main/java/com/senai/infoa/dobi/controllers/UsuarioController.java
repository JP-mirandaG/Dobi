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

import com.senai.infoa.dobi.models.Usuario;
import com.senai.infoa.dobi.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

     @PostMapping("/cadastrar")
    public Usuario salvar(@RequestBody @NonNull Usuario usuario) {
        return usuarioService.salvar(usuario);
    }

   @PostMapping("/login")
    public Usuario login(@RequestParam String email, @RequestParam String senha) {
        return usuarioService.login(email, senha);
    }

     @PutMapping("/atualizar/{id}")
    public Usuario atualizar(@PathVariable @NonNull Integer id, @RequestBody Usuario usuario) {
        return usuarioService.atualizar(usuario, id);
        
    }

    @GetMapping("/listar")
    public List<Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }

     @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable @NonNull Integer id) {
        boolean buscou = usuarioService.buscar(id);
        if (buscou) {
            String texto = "Usuario " + id + "encontrado com sucesso";
            return texto;
        }
        return "Falha ao buscar o usuario";
    }

    @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable @NonNull Integer id) {
        boolean deletou = usuarioService.apagar(id);
        if (deletou) {
            return "Usuario removido com sucesso";
        }
        return "Falha ao remover o usuario";
    }
}
