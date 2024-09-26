package com.mycompany.proyecto2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.proyecto2.models.User;
import com.mycompany.proyecto2.repositories.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<User> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @PostMapping
    public User createUsuario(@RequestBody User usuario) {
        return usuarioRepository.save(usuario);
    }
}
