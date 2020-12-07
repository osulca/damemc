package com.example.myapplication;

public class Producto {
    private int Imagen;
    private String Nombre;
    private float Precio;

    public Producto(int imagen, String nombre, float precio) {
        Imagen = imagen;
        Nombre = nombre;
        Precio = precio;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String numero) {
        Nombre = numero;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }
}
