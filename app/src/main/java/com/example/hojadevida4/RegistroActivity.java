package com.example.hojadevida4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity {

    EditText nombre, documento, edad, direccion, telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = (EditText)findViewById(R.id.nombreUsuario);
        documento = (EditText)findViewById(R.id.docUsuario);
        edad = (EditText)findViewById(R.id.edadUsuario);
        direccion = (EditText)findViewById(R.id.direccionUsuario);
        telefono = (EditText)findViewById(R.id.telUsuario);

    }

    public void Registrar(View view) {
    }

    public void Siguiente(View view) {

        Intent myIntent = new Intent(this, EstudiosActivity.class );

        Bundle myBundle = new Bundle();
        myBundle.putString("nombre", nombre.getText().toString());
        myBundle.putString("documento", documento.getText().toString());
        myBundle.putString("edad", edad.getText().toString());
        myBundle.putString("direccion", direccion.getText().toString());
        myBundle.putString("telefono", telefono.getText().toString());

        myIntent.putExtras(myBundle);
        startActivity(myIntent);
    }
}
