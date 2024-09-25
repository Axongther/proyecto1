package com.mycompany.proyecto1;

import com.mycompany.proyecto2.models.Empleado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    private Empleado empleado;

    @BeforeEach
    public void setUp() {
        empleado = new Empleado("Nicolás", "IT");
    }

    @Test
    public void testGetId() {
        assertEquals(1, empleado.getId());
    }

    @Test
    public void testGetNombre() {
        assertEquals("Nicolás", empleado.getNombre());
    }

    @Test
    public void testGetDepartamento() {
        assertEquals("IT", empleado.getDepartamento());
    }

    @Test
    public void testToString() {
        String expected = "Empleado{id=1, nombre='Nicolás', departamento='IT'}";
        assertEquals(expected, empleado.toString());
    }
}
