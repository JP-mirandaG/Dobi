package com.senai.infoa.dobi.services;


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

     public Usuario buscar(@NonNull Integer id) {
    return usuarioRepository.findById(id).orElse(null);
}

     public Usuario login(String email, String senha, String tipo){
        Usuario usuario = usuarioRepository.findByUsuario(email, senha, tipo);
        if(usuario != null && senha.equals(usuario.getSenha()) && tipo.equals(usuario.getTipo().toString())){
            return usuario;
        }
        return null;
    }

    public Usuario atualizar(Usuario usuario, String email){
    Usuario usuario2 = usuarioRepository.findByEmail(email);
    if(usuario2 != null){
        usuario.setNome(usuario.getNome());
        usuario.setSenha(usuario.getSenha());
        return usuarioRepository.save(usuario);
    }
    return null;
}

public Usuario desativar(String email){

    Usuario usuario = usuarioRepository.findByEmail(email);

    if(usuario != null){

        usuario.setAtivo(false);

        return usuarioRepository.save(usuario);
    }

    return null;
}


}
