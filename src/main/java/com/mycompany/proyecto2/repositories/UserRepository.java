package com.mycompany.proyecto2.repositories;

import com.mycompany.proyecto2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}