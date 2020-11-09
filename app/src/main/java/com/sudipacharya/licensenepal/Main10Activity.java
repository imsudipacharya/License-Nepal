package com.sudipacharya.licensenepal;

import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;


public class Main10Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);




        WebView exams = (WebView) findViewById(R.id.aboutus);
        exams.getSettings().setJavaScriptEnabled(true);
        exams.setBackgroundColor(Color.BLACK);
        exams.loadUrl("https://play.google.com/store/apps/developer?id=App+Deepo");

    }



    }



