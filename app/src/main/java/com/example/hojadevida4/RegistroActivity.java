package com.example.hojadevida4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import com.example.hojadevida4.entidades.ConexionSQLiteHelper;
import com.example.hojadevida4.utilidades.Utilidades;

public class RegistroActivity extends AppCompatActivity {

    EditText nombre, documento, edad, direccion, telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre    = (EditText)findViewById(R.id.nombreUsuario);
        documento = (EditText)findViewById(R.id.docUsuario);
        edad      = (EditText)findViewById(R.id.edadUsuario);
        direccion = (EditText)findViewById(R.id.direccionUsuario);
        telefono  = (EditText)findViewById(R.id.telUsuario);

    }

    public void onClick(View view){

        registrarUsuarios( );


    }

    public void registrarUsuarios() {

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_usuarios",null,1);

        SQLiteDatabase db = conn.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(Utilidades.CAMPO_ID,     documento.getText().toString() );
        values.put(Utilidades.CAMPO_NOMBRE, nombre.getText().toString() );
        values.put(Utilidades.CAMPO_EDAD,   edad.getText().toString() );
        values.put(Utilidades.CAMPO_DIRECCION,direccion.getText().toString() );
        values.put(Utilidades.CAMPO_TELEFONO,telefono.getText().toString() );

        Long idResultante = db.insert(Utilidades.TABLA_USUARIO,Utilidades.CAMPO_ID,values);

        Toast.makeText(getApplicationContext(),"ID Registro"+idResultante, Toast.LENGTH_LONG).show();

    }

    //Metodo para registrar por medio de sentencias SQL Normales
    private void registrarUsuariosSql(){

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_usuarios",null,1);

        SQLiteDatabase db = conn.getWritableDatabase();

        String insert="insert into "+Utilidades.TABLA_USUARIO+"("+Utilidades.CAMPO_ID+","+Utilidades.CAMPO_NOMBRE+" ,"+Utilidades.CAMPO_TELEFONO+
                ") values('"+documento.getText().toString()+"','"+nombre.getText().toString()+"','"+telefono.getText().toString()+"' ) ";

        db.execSQL(insert);

        db.close();

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
