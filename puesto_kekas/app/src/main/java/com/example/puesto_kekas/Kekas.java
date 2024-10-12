package com.example.puesto_kekas;

public class Kekas {

    private String guisado;
    private int precio;

    public Kekas(String guisado, int precio){
        this.guisado = guisado;
        this.precio = precio;
    }

    public Kekas(){}

    public int getPrecio() {
        return precio;
    }

    public String toString() {
        return guisado;
    }

}
