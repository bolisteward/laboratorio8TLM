package com.example.laboratorio8tlm_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


    }

    public void inicio(View view) {
        EditText usuario = (EditText) findViewById(R.id.edt_usuario);
        EditText password = (EditText) findViewById(R.id.edt_contrseña);
        Bundle user = new Bundle();
        if (usuario.getText()!=null && password.getText()!=null) {
            user.putString("usuario", usuario.getText().toString());
            user.putString("password", password.getText().toString());
            Intent i = new Intent(this, Bienvenida.class);
            i.putExtra("user",user);
            startActivity(i);
        }else{
            Toast.makeText(this, "No ha ingresado usuario y contraseña", Toast.LENGTH_SHORT).show();
        }
    }
}
