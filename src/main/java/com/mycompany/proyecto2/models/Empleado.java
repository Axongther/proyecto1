package com.mycompany.proyecto2.models;

public class Empleado {
    private int id;
    private String nombre;
    private String departamento;
    private static int contador = 0;

    public Empleado(String nombre, String departamento) {
        this.id = ++contador;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + "', departamento='" + departamento + "'}";
    }
}
