package com.sudipacharya.licensenepal;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;


public class MainActivity extends AppCompatActivity {

    private InterstitialAd interstitialAd7,interstitialAd6,interstitialAd,interstitialAd1,interstitialAd2,interstitialAd3,interstitialAd4,interstitialAd5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "785946325303627_785947828636810");
        interstitialAd.loadAd();



        AudienceNetworkAds.initialize(this);
        interstitialAd1 = new InterstitialAd(this, "785946325303627_785948038636789");
        interstitialAd1.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd2 = new InterstitialAd(this, "785946325303627_785948145303445");
        interstitialAd2.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd3 = new InterstitialAd(this, "785946325303627_785949005303359");
        interstitialAd3.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd4 = new InterstitialAd(this, "785946325303627_785949095303350");
        interstitialAd4.loadAd();

        AudienceNetworkAds.initialize(this);
        interstitialAd5 = new InterstitialAd(this, "785946325303627_785949165303343");
        interstitialAd5.loadAd();

        AudienceNetworkAds.initialize(this);
        interstitialAd6 = new InterstitialAd(this, "785946325303627_785949281969998");
        interstitialAd6.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd7 = new InterstitialAd(this, "785946325303627_785949341969992");
        interstitialAd7.loadAd();







        Button chapter1 = (Button) findViewById(R.id.chapter1);
        Button chapter2 = (Button) findViewById(R.id.chapter2);
        Button chapter3 = (Button) findViewById(R.id.chapter3);
        Button chapter4 = (Button) findViewById(R.id.chapter4);
        Button chapter5 = (Button) findViewById(R.id.chapter5);
        Button chapter6 = (Button) findViewById(R.id.chapter6);
        Button chapter7 = (Button) findViewById(R.id.chapter7);
        Button chapter8 = (Button) findViewById(R.id.chapter8);
        Button chapter9 = (Button) findViewById(R.id.chapter9);
        Button chapter10 = (Button) findViewById(R.id.chapter10);
        Button chapter11 = (Button) findViewById(R.id.chapter11);
        Button chapter12 = (Button) findViewById(R.id.chapter12);


        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd.isAdLoaded()) {

                    interstitialAd.show();
                } else {
                    Intent chp1 = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(chp1);
                }

            }

        });

        chapter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent chp7 = new Intent(MainActivity.this, Main3Activity.class);
                    startActivity(chp7);

            }
        });

        chapter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd1.isAdLoaded()) {

                    interstitialAd1.show();
                } else {
                    Intent chp3 = new Intent(MainActivity.this, Main4Activity.class);
                    startActivity(chp3);
                }
            }
        });

        chapter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (interstitialAd2.isAdLoaded()) {

                    interstitialAd2.show();
                } else {
                    Intent chp4 = new Intent(MainActivity.this, Main5Activity.class);
                    startActivity(chp4);
                }
            }
        });

        chapter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd3.isAdLoaded()) {

                    interstitialAd3.show();
                } else {
                    Intent chp5 = new Intent(MainActivity.this, Main6Activity.class);
                    startActivity(chp5);
                }
            }
        });

        chapter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd4.isAdLoaded()) {

                    interstitialAd4.show();
                } else {
                    Intent chp6 = new Intent(MainActivity.this, Main7Activity.class);
                    startActivity(chp6);
                }
            }
        });

        chapter7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (interstitialAd5.isAdLoaded()) {

                    interstitialAd5.show();
                } else {
                    Intent chp2 = new Intent(MainActivity.this, Main8Activity.class);
                    startActivity(chp2);
                }
            }
        });

        chapter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd6.isAdLoaded()) {

                    interstitialAd6.show();
                } else {
                    Intent chp2 = new Intent(MainActivity.this, Main9Activity.class);
                    startActivity(chp2);
                }
            }
        });

        chapter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (interstitialAd7.isAdLoaded()) {

                    interstitialAd7.show();
                } else {
                    Intent chp9 = new Intent(MainActivity.this, Main10Activity.class);
                    startActivity(chp9);
                }
            }
        });

        chapter11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chp11 = new Intent(MainActivity.this,Main11Activity.class);
                startActivity(chp11);
            }
        });


        chapter10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
                share.putExtra(Intent.EXTRA_SUBJECT, "100% License Pass");
                share.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/developer?id=App+Deepo");

                startActivity(Intent.createChooser(share, "Share License Nepal"));
            }
        });


        chapter12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
                ab.setTitle("के तपाइँ  नेपाल लाइसेन्स एप्प  बन्द गर्न चाहानुहुन्छ?");
                ab.setPositiveButton("चाहन्छु", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        //if you want to kill app . from other then your main avtivity.(Launcher)
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);

                        //if you want to finish just current activity

                        MainActivity.this.finish();
                    }
                });
                ab.setNegativeButton("चाहन्न ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                ab.show();

            }
        });




    }


    @Override
    protected void onDestroy() {
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        super.onDestroy();
    }








    @Override
    public void onBackPressed() {

        AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
            ab.setTitle("के तपाइँ  नेपाल लाइसेन्स एप्प  बन्द गर्न चाहानुहुन्छ?");
            ab.setPositiveButton("चाहन्छु", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    //if you want to kill app . from other then your main avtivity.(Launcher)
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);

                    //if you want to finish just current activity

                    MainActivity.this.finish();
                }
            });
            ab.setNegativeButton("चाहन्न ", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });

            ab.show();
    }




}

