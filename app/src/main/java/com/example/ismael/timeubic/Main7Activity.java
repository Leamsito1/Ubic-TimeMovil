package com.example.ismael.timeubic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity {

    Button NuevaR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        NuevaR =(Button)findViewById(R.id.NuevaR);
        NuevaR.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

                Intent NuevaR = new Intent(Main7Activity.this, Main6Activity.class);
                startActivity(NuevaR);
            }
        });
    }
}
