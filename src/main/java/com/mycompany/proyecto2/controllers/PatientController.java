package com.mycompany.proyecto2.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {

    @Secured("ROLE_PATIENT")
    @GetMapping("/patient/dashboard")
    public String patientDashboard() {
        return "patient/dashboard";
    }
}