package com.sudipacharya.licensenepal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;


public class Main3Activity extends AppCompatActivity {
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "785946325303627_785949281969998");
        interstitialAd.loadAd();


    }


    @Override
    public void onBackPressed() {
        if (interstitialAd.isAdLoaded()){
            interstitialAd.show();
        }
        super.onBackPressed();
    }

}
