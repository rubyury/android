package com.example.examen_v1;

public class Operaciones {

    private int dato1;
    private int dato2;

    public Operaciones(int dato1, int dato2){
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public int suma (){
        return dato1 + dato2;
    }

    public int resta (){
        return dato1 - dato2;
    }

    public int multi (){
        return dato1 * dato2;
    }

    public int divi (){
        return dato1 / dato2;
    }

}
