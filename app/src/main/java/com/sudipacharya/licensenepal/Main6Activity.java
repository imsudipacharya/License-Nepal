package com.sudipacharya.licensenepal;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;


public class Main6Activity extends AppCompatActivity {

    private InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "785946325303627_785949005303359");
        interstitialAd.loadAd();

        WebView sign = (WebView) findViewById(R.id.sign);
        sign.getSettings().getJavaScriptEnabled();
        sign.loadUrl("file:///android_asset/trafficsign.html");


    }

    @Override
    public void onBackPressed() {
        if (interstitialAd.isAdLoaded()){
            interstitialAd.show();
        }
        super.onBackPressed();
    }




}
