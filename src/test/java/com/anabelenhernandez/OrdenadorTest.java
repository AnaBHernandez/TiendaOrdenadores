package com.anabelenhernandez;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OrdenadorTest {

    @Test
    public void testConstructorAndGetters() {
        // Crear un objeto Ordenador
        Ordenador ordenador = new Ordenador("Dell", 16, "Intel i7", "Windows 10", 1200.00);

        // Verificar que los valores se inicializaron correctamente
        assertEquals("Dell", ordenador.getMarca(), "La marca debería ser Dell.");
        assertEquals(16, ordenador.getMemoria(), "La memoria debería ser 16GB.");
        assertEquals("Intel i7", ordenador.getProcesador(), "El procesador debería ser Intel i7.");
        assertEquals("Windows 10", ordenador.getSistemaOperativo(), "El sistema operativo debería ser Windows 10.");
        assertEquals(1200.00, ordenador.getPrecio(), 0.01, "El precio debería ser 1200.00.");
    }

    @Test
    public void testToString() {
        // Crear un objeto Ordenador
        Ordenador ordenador = new Ordenador("HP", 8, "AMD Ryzen 5", "Windows 11", 800.00);

        // Verificar el método toString
        String expectedString = "Marca: HP, Memoria: 8GB, Procesador: AMD Ryzen 5, SO: Windows 11, Precio: $800.0";
        assertEquals(expectedString, ordenador.toString(), "La representación de cadena no coincide con el formato esperado.");
    }
}
