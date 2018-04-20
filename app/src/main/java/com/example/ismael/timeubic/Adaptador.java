package com.example.ismael.timeubic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ISMAEL on 23/03/2018.
 */

public class Adaptador extends BaseAdapter {

    Context context;
    List<Datos>ListaObjetos;

    public Adaptador(Context context, List<Datos> listaObjetos) {
        this.context = context;
        ListaObjetos = listaObjetos;
    }

    @Override
    public int getCount() {
        return ListaObjetos.size();//retorna la cantidad de elementos

    }

    @Override
    public Object getItem(int potition) {
        return ListaObjetos.get(potition);
    }

    @Override
    public long getItemId(int potition) {
        return ListaObjetos.get(potition).getId();
    }

    @Override
    public View getView(int potition, View convertView, ViewGroup Parent) {
        View vista=convertView;
        LayoutInflater inflater=LayoutInflater.from(context);
        vista=inflater.inflate(R.layout.spinner_item_estilo,null);

        TextView estacion=(TextView)vista.findViewById(R.id.spinnerEstaciones);

        estacion.setText(ListaObjetos.get(potition).getEstacion().toString());

        return vista;

    }
}
