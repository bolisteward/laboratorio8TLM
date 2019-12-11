package com.example.laboratorio8tlm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {
    String URL ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        URL = getIntent().getStringExtra("URL");

    }

    public void volver(View view){
        finish();
    }
}
