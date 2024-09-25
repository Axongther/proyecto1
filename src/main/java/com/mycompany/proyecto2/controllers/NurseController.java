package com.mycompany.proyecto2.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NurseController {

    @Secured("ROLE_NURSE")
    @GetMapping("/nurse/dashboard")
    public String nurseDashboard() {
        return "nurse/dashboard";
    }
}