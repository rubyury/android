package com.example.numeros;

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

    EditText dato1, dato2, dato3;

    Button guardar, mayor, menor, suma, promedio;

    int arreglo[] = new int[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        dato1 = findViewById(R.id.dato1);
        dato2 = findViewById(R.id.dato2);
        dato3 = findViewById(R.id.dato3);

        guardar = findViewById(R.id.guardar);
        guardar.setOnClickListener(this);

        mayor = findViewById(R.id.mayor);
        mayor.setOnClickListener(this);

        menor = findViewById(R.id.menor);
        menor.setOnClickListener(this);

        suma = findViewById(R.id.suma);
        suma.setOnClickListener(this);

        promedio = findViewById(R.id.promedio);
        promedio.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String cadena = ((Button) v).getText().toString();

        if (cadena.equals("guardar")){

            arreglo[0] = Integer.parseInt(dato1.getText().toString());
            arreglo[1] = Integer.parseInt(dato2.getText().toString());
            arreglo[2] = Integer.parseInt(dato3.getText().toString());

            mayor.setEnabled(true);
            menor.setEnabled(true);
            suma.setEnabled(true);
            promedio.setEnabled(true);
            guardar.setEnabled(false);

            Toast.makeText(this, "guardado",
                    Toast.LENGTH_LONG).show();

        } else if (cadena.equals("mayor")){

            Datos datos = new Datos();

            datos.setDato1(arreglo[0]);
            datos.setDato2(arreglo[1]);
            datos.setDato3(arreglo[2]);

            Toast.makeText(this, "mayor "+ datos.mayor(),
                    Toast.LENGTH_LONG).show();

        }else if (cadena.equals("menor")){

        }else if (cadena.equals("suma")){

            Datos datos = new Datos();

            datos.setDato1(arreglo[0]);
            datos.setDato2(arreglo[1]);
            datos.setDato3(arreglo[2]);

            Toast.makeText(this, "suma "+ datos.suma(),
                    Toast.LENGTH_LONG).show();

        }else if (cadena.equals("promedio")){

            Datos datos = new Datos();

            datos.setDato1(arreglo[0]);
            datos.setDato2(arreglo[1]);
            datos.setDato3(arreglo[2]);

            Toast.makeText(this, "promedio "+ datos.promedio(),
                    Toast.LENGTH_LONG).show();

        }

    }
}