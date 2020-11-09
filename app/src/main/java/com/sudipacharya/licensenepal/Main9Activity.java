package com.sudipacharya.licensenepal;

import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;


public class Main9Activity extends AppCompatActivity {
    private InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "785946325303627_785948038636789");
        interstitialAd.loadAd();


    WebView exam = (WebView) findViewById(R.id.exam);
        exam.getSettings().setJavaScriptEnabled(true);
        exam.setBackgroundColor(Color.rgb(244,	138,	254));
        exam.loadUrl("file:///android_asset/quesans.html");
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
