package com.example.vocales;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editado;

    Button vocales, consonantes, numeros, palindromo, especiales, espacios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editado = findViewById(R.id.editado);


        vocales = findViewById(R.id.vocales);
        vocales.setOnClickListener(this);

        consonantes = findViewById(R.id.consonantes);
        consonantes.setOnClickListener(this);

        numeros = findViewById(R.id.numeros);
        numeros.setOnClickListener(this);

        palindromo = findViewById(R.id.palindromo);
        palindromo.setOnClickListener(this);

        especiales = findViewById(R.id.especiales);
        especiales.setOnClickListener(this);

        espacios = findViewById(R.id.espacios);
        espacios.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String cadena = ((Button) v).getText().toString();

        if (cadena.equals("vocales")){

            Texto texto = new Texto(editado.getText().toString());


        } else if (cadena.equals("consonantes")){

        }else if (cadena.equals("numeros")){

        }else if (cadena.equals("palindromo")){

            Texto texto = new Texto(editado.getText().toString());

            Toast.makeText(this, "vocales "+ texto.revertir("reverso"),
                    Toast.LENGTH_LONG).show();

        }else if (cadena.equals("especiales")){

        }else if (cadena.equals("espacios")){

        }

    }
}