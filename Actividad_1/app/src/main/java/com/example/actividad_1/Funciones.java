package com.example.actividad_1;

public class Funciones {

    private String texto;

    Funciones (String text){
        this.texto = text;
    }

    public int espacios(){
        int cont = 0;
        char espacio = (char) 32;
        for (int i = 0; i < texto.length(); i++){
            char caracter = texto.charAt(i);
        if (caracter == espacio){
            cont++;
        }
        }
        return cont;
    }

    public int vocales(){
        int cont = 0;
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < texto.length(); i++){
            char caracter = texto.charAt(i);
            for (int j = 0; j < vocales.length; j++){
                if (caracter == vocales[j]){
                    cont++;
                }
            }
        }
        return cont;
    }

	public int idk(){
String input = "GeeksforGeeks";

        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = input.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        System.out.println(new String(result));
}

}
