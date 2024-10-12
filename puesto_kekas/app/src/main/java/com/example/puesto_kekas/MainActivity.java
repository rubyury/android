package com.example.puesto_kekas;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    Button but1, but2;
    EditText edit1;
    Spinner spinner;
    TextView text;
    Comal comal;
    ArrayList<Kekas> arreglo;
    ArrayAdapter<Kekas> adapter;
    Miss miss;
    Kekas keka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        but1 = findViewById(R.id.but1);
        but2 = findViewById(R.id.but2);
        edit1 = findViewById(R.id.edit1);
        spinner = findViewById(R.id.spinner);
        text = findViewById(R.id.texto);

        miss = new Miss();

        but1.setOnClickListener(this);
        but2.setOnClickListener(this);

        comal = new Comal();
        arreglo = comal.regreso();

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arreglo);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onClick(View view) {

        int cantidad = Integer.parseInt(edit1.getText().toString());

        int id = view.getId();

        if (id == but1.getId()){

            miss.agarrar(keka, cantidad);

            Toast.makeText(this, "ordenado",
                    Toast.LENGTH_LONG).show();

        } else if (id == but2.getId()){
            text.setText(miss.total());
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        keka = adapter.getItem(i);

        if (i > 0){
            Toast.makeText(this, keka.toString(),
                    Toast.LENGTH_LONG).show();
        } else if (i == 0){

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}