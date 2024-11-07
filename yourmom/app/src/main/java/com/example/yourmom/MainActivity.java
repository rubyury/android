package com.example.yourmom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String deportesComenta[] = {
            "uno", "dos", "tres", "cuatro", "cinco", "seis",
            "siete", "ocho", "nueve", "diez"
    };

    String deportesLista[] = {
            "EVERYTHING","WILL","END","ONE" ,
            "DAY","so","do","your","best","uwu",
    };

    /*
    int imagenes[] = {
            R.drawable.belle_chiquito, R.drawable.slepy_belle,
            R.drawable.maurice
    };

     */

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        listView.setOnItemClickListener(this);

        Adaptador adaptador = new Adaptador(getApplicationContext(),
                deportesComenta, deportesLista);

        listView.setAdapter(adaptador);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}