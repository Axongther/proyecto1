package com.mycompany.proyecto2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.proyecto2.models.User;

public interface UsuarioRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
