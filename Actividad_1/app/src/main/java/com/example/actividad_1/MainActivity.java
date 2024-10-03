package com.example.actividad_1;

import static com.example.actividad_1.R.id.*;

import android.annotation.SuppressLint;
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

    Button but1, but2, but3, but4, but5, but6, but7, but8;

    EditText edit1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.edit1);

        but1 = findViewById(R.id.but1);
        but1.setOnClickListener(this);

        but2 = findViewById(R.id.but2);
        but2.setOnClickListener(this);

        but3 = findViewById(R.id.but3);
        but3.setOnClickListener(this);

        but4 = findViewById(R.id.but4);
        but4.setOnClickListener(this);

        but5 = findViewById(R.id.but5);
        but5.setOnClickListener(this);

        but6 = findViewById(R.id.but6);
        but6.setOnClickListener(this);

        but7 = findViewById(R.id.but7);
        but7.setOnClickListener(this);

        but8 = findViewById(R.id.but8);
        but8.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String bText = ((Button) view).getText().toString();

        if (bText.equals("guardar")){

            String texto = edit1.getText().toString();

            Toast.makeText(this, "Guardado" + texto,
                    Toast.LENGTH_LONG).show();

        }else if (bText.equals("consonantes")){

            Toast.makeText(this, "Consonantes: ",
                    Toast.LENGTH_LONG).show();

        }else if (bText.equals("numeros")){

            Toast.makeText(this, "Numeros: ",
                    Toast.LENGTH_LONG).show();

        }else if (bText.equals("palindromo")){

            Toast.makeText(this, "Palindromo ",
                    Toast.LENGTH_LONG).show();

        }else if (bText.equals("especiales")){

            Toast.makeText(this, "Especiales: ",
                    Toast.LENGTH_LONG).show();

        }else if (bText.equals("espacios")){

            Funciones funcion = new Funciones(edit1.getText().toString());

            int total = funcion.espacios();

            Toast.makeText(this, "Espacios: " + total,
                    Toast.LENGTH_LONG).show();

        }else if (bText.equals("vocales")){

            Funciones funcion = new Funciones(edit1.getText().toString());

            int total = funcion.vocales();

            Toast.makeText(this, "Vocales: " + total,
                    Toast.LENGTH_LONG).show();

        }else if (bText.equals("regresar")){

            Toast.makeText(this, "Regresar ",
                    Toast.LENGTH_LONG).show();

        }

    }
}