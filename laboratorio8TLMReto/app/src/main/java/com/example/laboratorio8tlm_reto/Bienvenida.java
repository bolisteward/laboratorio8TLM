package com.example.laboratorio8tlm_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Bienvenida extends AppCompatActivity {
    public TextView txtBienvenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        Bundle info = getIntent().getBundleExtra("user");

        txtBienvenido =  findViewById(R.id.txtBienvenido);

        String  texto =  "Bienvenido "+ info.getString("usuario");
        txtBienvenido.setText(texto);

    }

    public void volver (View view){finish();}
}
