package com.example.puesto_kekas;

import java.util.ArrayList;

public class Comal {

    private ArrayList<Kekas> kekas;

    public Comal(){
        kekas = new ArrayList<>();
        kekas.add(new Kekas("", 0));
        kekas.add(new Kekas("Pollo", 20));
        kekas.add(new Kekas("Picadillo", 25));
        kekas.add(new Kekas("Chicharron", 20));
    }

    public ArrayList<Kekas> regreso(){
        return kekas;
    }

}
