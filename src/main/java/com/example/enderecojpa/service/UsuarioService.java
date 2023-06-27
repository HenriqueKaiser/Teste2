package com.example.enderecojpa.service;

import com.example.enderecojpa.entity.Usuario;
import com.example.enderecojpa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public Usuario salvarUsuario(Usuario usuario){
     return usuarioRepository.save(usuario);
    }
}
