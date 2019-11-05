package com.example.hojadevida4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LaboralActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboral);
    }

    public void Siguiente(View view) {

        Intent myIntent = new Intent(this, PersonalActivity.class );
        startActivity(myIntent);
    }
}
