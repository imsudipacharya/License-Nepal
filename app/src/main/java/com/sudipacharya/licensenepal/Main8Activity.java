package com.sudipacharya.licensenepal;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;


public class Main8Activity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);



        WebView prep = (WebView) findViewById(R.id.prep2);
        WebSettings webSettings = prep.getSettings();
        prep.setWebViewClient(new WebViewClient());
        prep.setWebChromeClient(new WebChromeClient());
        webSettings.setJavaScriptEnabled(true);
        prep.loadUrl("file:///android_asset/quessample.html");

    }




}
