package com.example.hojadevida4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.hojadevida4.entidades.ConexionSQLiteHelper;

public class MainActivity extends AppCompatActivity
        implements FragmentRigth.OnFragmentInteractionListener,FragmentLeft.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"bd_usuarios",null,1);

    }

    @Override

    public void onFragmentInteraction(Uri uri) {

    }


}
