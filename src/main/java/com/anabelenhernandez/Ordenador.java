package com.anabelenhernandez;

public class Ordenador {
    private String marca;
    private int memoria;
    private String procesador;
    private String sistemaOperativo;
    private double precio;

    // Constructor
    public Ordenador(String marca, int memoria, String procesador, String sistemaOperativo, double precio) {
        this.marca = marca;
        this.memoria = memoria;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }

    // Métodos Getters
    public String getMarca() {
        return marca;
    }

    public int getMemoria() {
        return memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public double getPrecio() {
        return precio;
    }

    // Método toString para representar el objeto
    @Override
    public String toString() {
        return "Marca: " + marca + ", Memoria: " + memoria + "GB, Procesador: " + procesador + ", SO: " + sistemaOperativo + ", Precio: $" + precio;
    }
}