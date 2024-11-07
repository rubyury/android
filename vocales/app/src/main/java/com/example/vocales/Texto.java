package com.example.vocales;

public class Texto {

    private String cadena;


    public String revertir (String reverso){
        String originalStr = reverso;
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        return reversedStr;

    }


    Texto (String texto){
        this.cadena = texto;
    }



}
