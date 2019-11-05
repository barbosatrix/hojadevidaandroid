package com.example.hojadevida4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
    }


    public void Siguiente(View view) {

        Intent myIntent = null;

        switch (view.getId()) {

            case R.id.Siguiente:
            myIntent = new Intent(this, FamiliarActivity.class);
            break;

            case R.id.Finalizar:
            myIntent = new Intent(this, RegistroActivity.class);
            break;

        }

        startActivity(myIntent);
    }
}
