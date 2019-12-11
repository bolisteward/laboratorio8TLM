package com.example.laboratorio8tlm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle bundle = getIntent().getExtras();
        WebView webView1 = (WebView) findViewById(R.id.web_View);
        WebSettings conf = webView1.getSettings();
        conf.setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("httpS://" + bundle.getString("direccion"));

    }

    public void volver(View view){
        finish();
    }

}
