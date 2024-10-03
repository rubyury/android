package com.example.examen_v1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    ListView list;
    ArrayList<String> arreglo;
    ArrayAdapter<CharSequence> adapter;
    EditText edit1, edit2;
    Mensajes mensajes;
    Operaciones operaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);

        list = findViewById(R.id.list);

        mensajes = new Mensajes();

        arreglo = new ArrayList<>();
        arreglo = mensajes.regresa();

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arreglo);

        list.setAdapter(adapter);
        list.setOnItemClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        String text = adapterView.getItemAtPosition(i).toString();

        String text1 = edit1.getText().toString();
        String text2 = edit2.getText().toString();

        int dato1 = Integer.parseInt(text1);
        int dato2 = Integer.parseInt(text2);

        operaciones = new Operaciones(dato1, dato2);

        if (text.equals("suma")){
            Toast.makeText(this, "suma " + operaciones.suma(),
                    Toast.LENGTH_LONG).show();
        } else if (text.equals("resta")){
            Toast.makeText(this, "resta " + operaciones.resta(),
                    Toast.LENGTH_LONG).show();
        } else if (text.equals("multi")){
            Toast.makeText(this, "multi " + operaciones.multi(),
                    Toast.LENGTH_LONG).show();
        } else if (text.equals("divi")){
            Toast.makeText(this, "divi " + operaciones.divi(),
                    Toast.LENGTH_LONG).show();
        } else if (text.equals("exit")){
            finish();
        }

    }
}