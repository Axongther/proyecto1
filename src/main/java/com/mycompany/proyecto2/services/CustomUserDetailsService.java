package com.mycompany.proyecto2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mycompany.proyecto2.models.User;
import com.mycompany.proyecto2.repositories.UsuarioRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Buscar el usuario en el repositorio
        User user = userRepository.findByUsername(username);
        
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        // Construir el UserDetails para Spring Security
        UserBuilder builder = org.springframework.security.core.userdetails.User.withUsername(user.getUsername());
        builder.password(user.getPassword()); // La contraseña debe estar encriptada
        builder.roles(user.getRoles().toArray(String[]::new)); // Convertir Set<String> a String[]
        builder.disabled(!user.isEnabled()); // Manejar el estado de habilitado o deshabilitado del usuario

        return builder.build();
    }
}
