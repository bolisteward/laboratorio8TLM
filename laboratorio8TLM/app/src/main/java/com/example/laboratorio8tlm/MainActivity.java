package com.example.laboratorio8tlm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inicio(View view) {
        EditText et1 = (EditText) findViewById(R.id.edt_Url);
        Intent i = new Intent(this, Main3Activity.class );
        i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }

}
