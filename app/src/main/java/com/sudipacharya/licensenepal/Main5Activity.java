package com.sudipacharya.licensenepal;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;


public class Main5Activity extends AppCompatActivity {

    private InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "785946325303627_785949095303350");
        interstitialAd.loadAd();

        WebView prep = (WebView) findViewById(R.id.prep);
        WebSettings webSettings = prep.getSettings();
        webSettings.setJavaScriptEnabled(true);
        prep.loadUrl("file:///android_asset/prep.html");


        WebView prepa = (WebView) findViewById(R.id.prepa);
        WebSettings webSettingsa = prepa.getSettings();
        webSettingsa.setJavaScriptEnabled(true);
        prepa.loadUrl("file:///android_asset/likhit1.html");




    }


    @Override
    public void onBackPressed() {
        if (interstitialAd.isAdLoaded()){
            interstitialAd.show();
        }
        super.onBackPressed();
    }


    @Override
    protected void onDestroy() {

        super.onDestroy();
    }


}
