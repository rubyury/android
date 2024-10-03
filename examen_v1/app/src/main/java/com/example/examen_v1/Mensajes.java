package com.example.examen_v1;

import java.util.ArrayList;

public class Mensajes {

    private ArrayList<String> mensajes;

    public Mensajes(){
        mensajes = new ArrayList<String>();
        mensajes.add("suma");
        mensajes.add("resta");
        mensajes.add("multi");
        mensajes.add("divi");
        mensajes.add("exit");
    }

    public ArrayList<String> regresa(){
        return mensajes;
    }

}
