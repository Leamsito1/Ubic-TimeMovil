package com.example.ismael.timeubic;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;


public class Main6Activity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {



    private static final String TAG = "MainActivity";
    private EditText mDisplayDate;
    EditText mDisplayTime;
    EditText timeAproximado;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    Spinner opciones;
    RelativeLayout estacion1;
    ArrayAdapter<String>aaOpciones,aaClear;
    String[] opcopciones= new String[]{"Número de estación","UNA","DOS","TRES","CUATRO","CINCO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        mDisplayDate = (EditText) findViewById(R.id.tvDate);
        mDisplayTime=(EditText)findViewById(R.id.timePicker);
        timeAproximado=(EditText)findViewById(R.id.TimeAproximado);


//spinner///

        opciones=(Spinner) findViewById(R.id.opciones);

        opciones.setOnItemSelectedListener(this);
        aaOpciones= new ArrayAdapter<String>(this, R.layout.spinner_item_estilo,opcopciones);
        opciones.setAdapter(aaOpciones);



//spinner////


        //selector de hora========
        mDisplayTime.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                Calendar calendar=Calendar.getInstance();
                //selector de hora
                int hour=calendar.get(Calendar.HOUR);
                int minute=calendar.get(Calendar.MINUTE);
                TimePickerDialog timePickerDialog= new TimePickerDialog(Main6Activity.this, new TimePickerDialog.OnTimeSetListener(){

                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                        mDisplayTime.setText(hourOfDay+":"+minute);

                    }
                },hour,minute, false);
                timePickerDialog.getWindow( ).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                timePickerDialog.show();

            }
        });

        timeAproximado.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                Calendar calendar=Calendar.getInstance();
                //selector de hora
                int hour=calendar.get(Calendar.HOUR);
                int minute=calendar.get(Calendar.MINUTE);
                TimePickerDialog timePickerDialog= new TimePickerDialog(Main6Activity.this, new TimePickerDialog.OnTimeSetListener(){

                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                        timeAproximado.setText(hourOfDay+":"+minute);

                    }
                },hour,minute,true);
                timePickerDialog.getWindow( ).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                timePickerDialog.show();

            }
        });

        //selector de fecha========
        mDisplayDate.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        Main6Activity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener=new DatePickerDialog.OnDateSetListener( ) {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateSet: dd/mm/yyy: " + day + "/" + month + "/" + year);
                String date = day + "/" + month + "/" + year;
                mDisplayDate.setText(date);

            }
        };

    }

    @Override
    public void onClick(View view) {

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i){
            case 1:
                Toast to1=Toast.makeText(getApplicationContext(), opcopciones[i], Toast.LENGTH_SHORT);
                to1.show();
                break;
            case 2:
                Toast to2=Toast.makeText(getApplicationContext(), opcopciones[i], Toast.LENGTH_SHORT);
                to2.show();
                break;
            case 3:
                Toast to3=Toast.makeText(getApplicationContext(), opcopciones[i], Toast.LENGTH_SHORT);
                to3.show();
                break;
            case 4:
                Toast to4=Toast.makeText(getApplicationContext(), opcopciones[i], Toast.LENGTH_SHORT);
                to4.show();
                break;
            case 5:
                Toast to5=Toast.makeText(getApplicationContext(), opcopciones[i], Toast.LENGTH_SHORT);
                to5.show();
                break;

        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
