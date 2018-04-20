package com.example.ismael.timeubic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {


    Spinner spinner;
    TabHost TbH1;
    Button Atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TbH1 = (TabHost) findViewById(R.id.tabHost); //llamamos al Tabhost
        TbH1.setup();                                                         //lo activamos

        TabHost.TabSpec tab1 = TbH1.newTabSpec("Contacto");  //aspectos de cada Tab (pestaña)
        TabHost.TabSpec tab2 = TbH1.newTabSpec("Usuario");

        tab1.setIndicator("Contacto");    //qué queremos que aparezca en las pestañas
        tab1.setContent(R.id.Contacto); //definimos el id de cada Tab (pestaña)

        tab2.setIndicator("Usuario");
        tab2.setContent(R.id.User);

        TbH1.addTab(tab1); //añadimos los tabs ya programados
        TbH1.addTab(tab2);


        Spinner spinner = (Spinner) findViewById(R.id.spinnerContactos);
        String[] letra = {"Elija el contacto","Contacto 1","Contacto 2","Contacto 3","Contacto 4","Contacto 5"};
        spinner.setAdapter(new ArrayAdapter<String>(this, R.layout.spinner_item_estilo2, letra));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener( ) {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                Toast.makeText(adapterView.getContext(),
                        (String) adapterView.getItemAtPosition(pos), Toast.LENGTH_LONG).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}
