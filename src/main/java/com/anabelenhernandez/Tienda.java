package com.anabelenhernandez;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombreTienda;
    private String propietario;
    private String idTributario;
    private List<Ordenador> ordenadores;

    // Constructor
    public Tienda(String nombreTienda, String propietario, String idTributario) {
        this.nombreTienda = nombreTienda;
        this.propietario = propietario;
        this.idTributario = idTributario;
        this.ordenadores = new ArrayList<>();
    }

    // Método para agregar un ordenador a la tienda
    public void agregarOrdenador(Ordenador ordenador) {
        ordenadores.add(ordenador);
    }

    // Método para eliminar un ordenador de la tienda por marca
    public void eliminarOrdenador(String marca) {
        ordenadores.removeIf(ordenador -> ordenador.getMarca().equalsIgnoreCase(marca));
    }

    // Método para buscar un ordenador en la tienda por marca
    public Ordenador buscarOrdenador(String marca) {
        for (Ordenador ordenador : ordenadores) {
            if (ordenador.getMarca().equalsIgnoreCase(marca)) {
                return ordenador;
            }
        }
        return null;
    }

    // Método para listar todos los ordenadores en la tienda
    public List<Ordenador> listarOrdenadores() {
        return new ArrayList<>(ordenadores);
    }
}
