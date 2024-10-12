package com.example.puesto_kekas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Miss {

    private int cuenta;
    private ArrayList<String> cuantas;
    private ArrayList<Kekas> kekas;

    public Miss(){
        kekas = new ArrayList<>();
        cuantas = new ArrayList<>();
    }

    public void agarrar(Kekas keka, int cantidad){
        kekas.add(keka);
        cuantas.add(Integer.toString(cantidad));
        this.cuenta = cuenta + keka.getPrecio() * cantidad;
    }

    public String total(){

        String nota = "";

        for (int i = 0; i < kekas.size(); i++){
            nota = nota + "\n" + kekas.get(i).toString() + "-----" + cuantas.get(i);
        }

        nota = nota + "\n" + cuenta;

        return nota;

    }

}
