package com.example.myapplication;

public class Contacto {
    private String color;
    private String nombres;
    private int telefono;

    public Contacto(String color, String nombres, int telefono) {
        this.color = color;
        this.nombres = nombres;
        this.telefono = telefono;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
