package com.example.yourmom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    Context contexto;
    String listaDeporte[];
    String listaComentador[];
    int listaImagenes[];
    LayoutInflater inflater;

    public Adaptador(Context contexto, String[] listaDeporte,
                     String[] listaComentador, int[] listaImagenes) {
        this.contexto = contexto;
        this.listaDeporte = listaDeporte;
        this.listaComentador = listaComentador;
        this.listaImagenes = listaImagenes;
        this.inflater = LayoutInflater.from(contexto);
    }

    @Override
    public int getCount() {
        return listaComentador.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.basura, null);

        TextView textView1 = convertView.findViewById(R.id.textView1);
        TextView textView2 = convertView.findViewById(R.id.textView2);
        ImageView imageView = convertView.findViewById(R.id.imageIcon);
        
        textView1.setText(listaDeporte[position]);
        textView2.setText(listaComentador[position]);
        imageView.setImageResource(listaImagenes[position]);

        return convertView;
    }
}
