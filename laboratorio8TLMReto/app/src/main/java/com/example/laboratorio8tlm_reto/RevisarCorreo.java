package com.example.laboratorio8tlm_reto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class RevisarCorreo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revisar_correo);

        WebView webView1 = findViewById(R.id.webView);
        WebSettings conf = webView1.getSettings();
        conf.setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("https://mail.google.com");
    }

    public void volver (View view){finish();}
}
