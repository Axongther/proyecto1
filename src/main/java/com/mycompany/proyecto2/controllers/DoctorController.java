package com.mycompany.proyecto2.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {

    @Secured("ROLE_DOCTOR")
    @GetMapping("/doctor/dashboard")
    public String doctorDashboard() {
        return "doctor/dashboard";
    }
}