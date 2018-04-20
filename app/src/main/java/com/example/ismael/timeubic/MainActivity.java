package com.example.ismael.timeubic;

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TabHost TbH;
    EditText et1, et2, et3,et4;
    private Cursor fila;

    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.NomUsuario);
        et2=findViewById(R.id.Email);
        et3=findViewById(R.id.Tel);
        et4=findViewById(R.id.password);

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



        ingresar= (Button) findViewById(R.id.ingresar);
        ingresar.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Inicio = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(Inicio);
            }
        });


    }
    // para la base de datos ingresar
    /*public void ingresar (View v){
        registrarUsuarios ismael= new registrarUsuarios(this, "isntituto",null,1);
        SQLiteDatabase db=ismael.getWritableDatabase();

        String usuario=et1.getText().toString();
        String password=et4.getText().toString();
        fila=db.rawQuery("select usuario,password from usuarios where usuario='"+usuario+"' and password='"+password+"'",null);

        while (fila.moveToFirst()==true){
            String usua=fila.getString(0);
            String pass=fila.getString(1);
            if (usuario.equals(usua)&&password.equals(pass)){
                Intent ven=new Intent(this,Main3Activity.class);
                startActivity(ven);
                et1.setText("");
                et4.setText("");
            }
            else
                Toast.makeText(getApplicationContext(),"contraseña o usuario incorrecto",Toast.LENGTH_LONG).show();
        }



    }
    public void salir (View v){
        finish();
    }*/
}
