package com.mycompany.proyecto2.models;

/**
 * Clase que representa un nodo en una estructura de datos.
 */
public class Nodo {
    Empleado empleado;
    Nodo izquierda, derecha;

    public Nodo(Empleado empleado) {
        this.empleado = empleado;
        izquierda = derecha = null;
    }
}