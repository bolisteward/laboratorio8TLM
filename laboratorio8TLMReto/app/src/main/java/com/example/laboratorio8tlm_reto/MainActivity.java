package com.example.laboratorio8tlm_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inicio (View view){
        Intent intent = new Intent(this, Inicio.class);
        startActivity(intent);
    }

    public void revisarCorreo (View view){
        Intent intent = new Intent(this, RevisarCorreo.class);
        startActivity(intent);
    }

    public void acercaDe (View view){
        Intent intent = new Intent(this, AcercaDe.class);
        startActivity(intent);
    }
}
