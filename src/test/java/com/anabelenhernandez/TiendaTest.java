package com.anabelenhernandez;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiendaTest {
    private Tienda tienda;
    private Ordenador ordenador1;
    private Ordenador ordenador2;

    @BeforeEach
    public void setUp() {
        // Inicializar la tienda y algunos objetos Ordenador antes de cada prueba
        tienda = new Tienda("Mi Tienda", "Propietario", "12345678");
        ordenador1 = new Ordenador("Dell", 16, "Intel i7", "Windows 10", 1200.00);
        ordenador2 = new Ordenador("HP", 8, "AMD Ryzen 5", "Windows 11", 800.00);
    }

    @Test
    public void testAgregarOrdenador() {
        tienda.agregarOrdenador(ordenador1);
        tienda.agregarOrdenador(ordenador2);

        List<Ordenador> ordenadores = tienda.listarOrdenadores();
        assertEquals(2, ordenadores.size(), "La tienda debe tener 2 ordenadores.");
        assertTrue(ordenadores.contains(ordenador1), "La tienda debe contener el ordenador Dell.");
        assertTrue(ordenadores.contains(ordenador2), "La tienda debe contener el ordenador HP.");
    }

    @Test
    public void testEliminarOrdenador() {
        tienda.agregarOrdenador(ordenador1);
        tienda.agregarOrdenador(ordenador2);

        tienda.eliminarOrdenador("Dell");
        List<Ordenador> ordenadores = tienda.listarOrdenadores();
        assertEquals(1, ordenadores.size(), "La tienda debe tener 1 ordenador después de eliminar.");
        assertFalse(ordenadores.contains(ordenador1), "El ordenador Dell debe haber sido eliminado.");
        assertTrue(ordenadores.contains(ordenador2), "La tienda debe contener el ordenador HP.");
    }

    @Test
    public void testBuscarOrdenador() {
        tienda.agregarOrdenador(ordenador1);
        tienda.agregarOrdenador(ordenador2);

        Ordenador encontrado = tienda.buscarOrdenador("Dell");
        assertNotNull(encontrado, "El ordenador Dell debería encontrarse en la tienda.");
        assertEquals("Dell", encontrado.getMarca(), "La marca del ordenador encontrado debe ser Dell.");

        Ordenador noEncontrado = tienda.buscarOrdenador("Lenovo");
        assertNull(noEncontrado, "El ordenador Lenovo no debería encontrarse en la tienda.");
    }

    @Test
    public void testListarOrdenadores() {
        tienda.agregarOrdenador(ordenador1);
        tienda.agregarOrdenador(ordenador2);

        List<Ordenador> ordenadores = tienda.listarOrdenadores();
        assertEquals(2, ordenadores.size(), "La tienda debe listar 2 ordenadores.");
    }
}
