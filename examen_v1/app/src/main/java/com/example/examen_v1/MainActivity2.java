package com.example.examen_v1;

import android.content.Intent;
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

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5;
    EditText edit1, edit2;
    Operaciones operaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String text1 = edit1.getText().toString();
        String text2 = edit1.getText().toString();

        int dato1 = Integer.parseInt(text1);
        int dato2 = Integer.parseInt(text2);

        operaciones = new Operaciones(dato1, dato2);

        if (view.getId()==R.id.btn1){
            Toast.makeText(this, "suma " + operaciones.suma(),
                    Toast.LENGTH_LONG).show();
        } else if (view.getId()==R.id.btn2){
            Toast.makeText(this, "resta " + operaciones.resta(),
                    Toast.LENGTH_LONG).show();
        } else if (view.getId()==R.id.btn3){
            Toast.makeText(this, "multiplicacion " + operaciones.multi(),
                    Toast.LENGTH_LONG).show();
        } else if (view.getId()==R.id.btn4){
            Toast.makeText(this, "divicion " + operaciones.divi(),
                    Toast.LENGTH_LONG).show();
        } else if (view.getId()==R.id.btn5){
            finish();
        }

    }
}