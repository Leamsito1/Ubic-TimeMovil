package com.example.ismael.timeubic;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {


    TabHost TbH;

    Button Inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TbH = (TabHost) findViewById(R.id.tabHost); //llamamos al Tabhost
        TbH.setup();                                                         //lo activamos

        TabHost.TabSpec tab1 = TbH.newTabSpec("tab1");  //aspectos de cada Tab (pestaña)
        TabHost.TabSpec tab2 = TbH.newTabSpec("tab2");

        tab1.setIndicator("Iniciar");    //qué queremos que aparezca en las pestañas
        tab1.setContent(R.id.ejemplo1); //definimos el id de cada Tab (pestaña)

        tab2.setIndicator("Crear cuenta");
        tab2.setContent(R.id.ejemplo2);

        TbH.addTab(tab1); //añadimos los tabs ya programados
        TbH.addTab(tab2);

        Inicio = (Button) findViewById(R.id.inicio);
        Inicio.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Inicio = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(Inicio);
            }
        });




    }
}
