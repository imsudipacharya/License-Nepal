package com.sudipacharya.licensenepal;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;


public class Main11Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);



        WebView prep1 = (WebView) findViewById(R.id.prep1);
        WebSettings webSettings = prep1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        prep1.loadUrl("file:///android_asset/number.html");
    }





}
