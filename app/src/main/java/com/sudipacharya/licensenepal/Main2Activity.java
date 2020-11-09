package com.sudipacharya.licensenepal;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;


public class Main2Activity extends AppCompatActivity {

private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "785946325303627_785949341969992");
        interstitialAd.loadAd();



        final WebView exms = (WebView) findViewById(R.id.onlineform);
        exms.getSettings().setJavaScriptEnabled(true);
        exms.setBackgroundColor(Color.BLACK);
        exms.loadUrl("https://onlineedlreg.dotm.gov.np/dlNewRegHome");
        



        final LinearLayout main = (LinearLayout) findViewById(R.id.main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.setVisibility(main.GONE);
                exms.setVisibility(exms.VISIBLE);
            }
        });





    }

    @Override
    public void onBackPressed() {
        if (interstitialAd.isAdLoaded()){
            interstitialAd.show();
        }
        super.onBackPressed();
    }
    }








