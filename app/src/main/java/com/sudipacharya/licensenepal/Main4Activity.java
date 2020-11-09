package com.sudipacharya.licensenepal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;


public class Main4Activity extends AppCompatActivity {

    private InterstitialAd interstitialAd,interstitialAd1;
LinearLayout pic3,pic4,pic9,pic10;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


         AudienceNetworkAds.initialize(this);
         interstitialAd = new InterstitialAd(this, "785946325303627_785949421969984");
         interstitialAd.loadAd();



         AudienceNetworkAds.initialize(this);
         interstitialAd1 = new InterstitialAd(this, "785946325303627_785949531969973");
         interstitialAd1.loadAd();






         final LinearLayout pic1 = (LinearLayout) findViewById(R.id.pic1);
        Button prevpic1 = (Button) findViewById(R.id.prevpic1);
        Button nexpic1 = (Button) findViewById(R.id.nexpic1);
        final LinearLayout pic2 = (LinearLayout) findViewById(R.id.pic2);
        Button prevpic2 = (Button) findViewById(R.id.prevpic2);
        Button nexpic2 = (Button) findViewById(R.id.nexpic2);
         pic3 = (LinearLayout) findViewById(R.id.pic3);
        Button prevpic3 = (Button) findViewById(R.id.prevpic3);
        Button nexpic3 = (Button) findViewById(R.id.nexpic3);
        pic4 = (LinearLayout) findViewById(R.id.pic4);
        Button prevpic4 = (Button) findViewById(R.id.prevpic4);
        Button nexpic4 = (Button) findViewById(R.id.nexpic4);
        final LinearLayout pic5 = (LinearLayout) findViewById(R.id.pic5);
        Button prevpic5 = (Button) findViewById(R.id.prevpic5);
        Button nexpic5 = (Button) findViewById(R.id.nexpic5);
        final LinearLayout pic6 = (LinearLayout) findViewById(R.id.pic6);
        Button prevpic6 = (Button) findViewById(R.id.prevpic6);
        Button nexpic6 = (Button) findViewById(R.id.nexpic6);
        final LinearLayout pic7 = (LinearLayout) findViewById(R.id.pic7);
        Button prevpic7 = (Button) findViewById(R.id.prevpic7);
        Button nexpic7 = (Button) findViewById(R.id.nexpic7);
         final LinearLayout pic8 = (LinearLayout) findViewById(R.id.pic8);
        Button prevpic8 = (Button) findViewById(R.id.prevpic8);
        Button nexpic8 = (Button) findViewById(R.id.nexpic8);
         pic9 = (LinearLayout) findViewById(R.id.pic9);
        Button prevpic9 = (Button) findViewById(R.id.prevpic9);
        Button nexpic9 = (Button) findViewById(R.id.nexpic9);
         pic10 = (LinearLayout) findViewById(R.id.pic10);
        Button prevpic10 = (Button) findViewById(R.id.prevpic10);
        Button nexpic10 = (Button) findViewById(R.id.nexpic10);

prevpic1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        pic1.setVisibility(pic1.GONE);
        pic10.setVisibility(pic10.VISIBLE);
    }
});

nexpic1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        pic1.setVisibility(pic1.GONE);
        pic2.setVisibility(pic2.VISIBLE);
    }
});

        prevpic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic2.setVisibility(pic2.GONE);
                pic1.setVisibility(pic1.VISIBLE);
            }
        });

        nexpic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic2.setVisibility(pic2.GONE);
                pic3.setVisibility(pic3.VISIBLE);
            }
        });

        prevpic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd1.isAdLoaded()){
                    interstitialAd1.show();
                }
                pic3.setVisibility(pic3.GONE);
                pic2.setVisibility(pic2.VISIBLE);
            }
        });

        nexpic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd.isAdLoaded()) {

                    interstitialAd.show();
                } else {
                    pic3.setVisibility(pic3.GONE);
                    pic4.setVisibility(pic4.VISIBLE);

                }
            }
        });


        prevpic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic4.setVisibility(pic4.GONE);
                pic3.setVisibility(pic3.VISIBLE);
            }
        });

        nexpic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic4.setVisibility(pic4.GONE);
                pic5.setVisibility(pic5.VISIBLE);
            }
        });


        prevpic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic5.setVisibility(pic5.GONE);
                pic4.setVisibility(pic4.VISIBLE);
            }
        });

        nexpic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic5.setVisibility(pic5.GONE);
                pic6.setVisibility(pic6.VISIBLE);
            }
        });


        prevpic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic6.setVisibility(pic6.GONE);
                pic5.setVisibility(pic5.VISIBLE);
            }
        });

        nexpic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic6.setVisibility(pic6.GONE);
                pic7.setVisibility(pic7.VISIBLE);
            }
        });

        prevpic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic7.setVisibility(pic7.GONE);
                pic6.setVisibility(pic6.VISIBLE);
            }
        });

        nexpic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic7.setVisibility(pic7.GONE);
                pic8.setVisibility(pic8.VISIBLE);
            }
        });

        prevpic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic8.setVisibility(pic8.GONE);
                pic7.setVisibility(pic7.VISIBLE);
            }
        });

        nexpic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic8.setVisibility(pic8.GONE);
                pic9.setVisibility(pic9.VISIBLE);
            }
        });

        prevpic9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic9.setVisibility(pic9.GONE);
                pic8.setVisibility(pic8.VISIBLE);
            }
        });

        nexpic9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic9.setVisibility(pic9.GONE);
                pic10.setVisibility(pic10.VISIBLE);
            }
        });


        prevpic10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic10.setVisibility(pic9.GONE);
                pic9.setVisibility(pic8.VISIBLE);
            }
        });

        nexpic10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd.isAdLoaded()) {

                    interstitialAd.show();
                } else {
                    pic10.setVisibility(pic10.GONE);
                    pic1.setVisibility(pic1.VISIBLE);
                }
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
