package com.example.hojadevida4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EstudiosActivity extends AppCompatActivity {

    TextView nombre;
    Spinner comboInstitutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudios);

        Bundle myBundle = this.getIntent().getExtras();

        nombre = (TextView)findViewById(R.id.nombreUsuario);

        //Cargando el combo
        comboInstitutos = (Spinner)findViewById(R.id.instituto);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.institutos,android.R.layout.simple_spinner_item);
        comboInstitutos.setAdapter(adapter);
        //Listener del cambio en Combo
        comboInstitutos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        if (myBundle != null){

            nombre.setText(myBundle.getString("nombre"));


        }



    }

    public void Siguiente(View view) {

        Intent myIntent = new Intent(this, LaboralActivity.class );
        startActivity(myIntent);
    }

}
