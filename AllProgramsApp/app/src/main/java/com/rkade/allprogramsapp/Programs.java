package com.rkade.allprogramsapp;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Programs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);


        WebView webView = findViewById(R.id.webview);

        Intent intentGet = getIntent();

        int gotData = intentGet.getIntExtra("data", 0);

        if (gotData == 0)
            webView.loadUrl("file:///android_asset/prog1.html");
        else if (gotData == 1)
            webView.loadUrl("file:///android_asset/prog2.html");
        else
            webView.loadUrl("file:///android_asset/prog3.html");

    }
}