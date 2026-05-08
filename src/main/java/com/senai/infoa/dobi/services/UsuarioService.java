package com.senai.infoa.dobi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.senai.infoa.dobi.models.Usuario;
import com.senai.infoa.dobi.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

public Usuario salvar(@NonNull Usuario usuario){
    if(usuario != null) {}
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

      public boolean buscar(@NonNull   Integer id) {
        Usuario usuario = usuarioRepository.findById(id).get();
        if(usuario != null){
           usuarioRepository.findById(id);
            return true;
  
        }

        return false;
    }

     public Usuario login(String email, String senha){
        Usuario usuario = usuarioRepository.findByUsuario(email, senha);
        if(usuario != null && senha.equals(usuario.getSenha())){
            return usuario;
        }
        return null;
    }

    public Usuario atualizar(Usuario usuario, @NonNull Integer id){
    Usuario usuario2 = usuarioRepository.findById(id).get();
    if(usuario2 != null){
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }
    return null;
}

 public boolean apagar(@NonNull  Integer id) {
        Usuario usuario = usuarioRepository.findById(id).get();
        if(usuario != null){
            usuarioRepository.deleteById(id);
            return true;
  
        }

        return false;
}
}
