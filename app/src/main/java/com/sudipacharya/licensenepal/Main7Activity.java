package com.sudipacharya.licensenepal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;


public class Main7Activity extends AppCompatActivity {

    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "785946325303627_785948145303445");
        interstitialAd.loadAd();

final TextView txtv = findViewById(R.id.textv);
        final Button download = (Button) findViewById(R.id.download);
       final Button downloads = (Button) findViewById(R.id.downloads);

        final VideoView videoView;
        videoView =  findViewById(R.id.video);

        if(!testConnection()){
           videoView.setVisibility(View.GONE);
txtv.setVisibility(View.VISIBLE);
        }else {

            videoView.setVideoPath("https://firebasestorage.googleapis.com/v0/b/nepal-license-9b0ae.appspot.com/o/%E0%A4%AE%E0%A5%8B%E0%A4%9F%E0%A4%B0%E0%A4%B8%E0%A4%BE%E0%A4%87%E0%A4%95%E0%A4%B2%E0%A4%95%E0%A5%8B%20%E0%A4%B2%E0%A4%BE%E0%A4%87%E0%A4%B8%E0%A5%87%E0%A4%A8%E0%A5%8D%E0%A4%B8%E0%A4%95%E0%A4%BE%20%E0%A4%B2%E0%A4%BE%E0%A4%97%E0%A4%BF%20%E0%A4%9F%E0%A5%8D%E0%A4%B0%E0%A4%BE%E0%A4%AF%E0%A4%B2%20(Nepaltara%20video%20report)_Foi-Q5nzLrM_1080p.mp4?alt=media&token=e63e556e-64c4-4274-bbb7-5b567e762cdb");
            videoView.start();


        }


downloads.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        videoView.setVideoPath("https://firebasestorage.googleapis.com/v0/b/nepal-license-9b0ae.appspot.com/o/%E0%A4%AE%E0%A5%8B%E0%A4%9F%E0%A4%B0%E0%A4%B8%E0%A4%BE%E0%A4%87%E0%A4%95%E0%A4%B2%E0%A4%95%E0%A5%8B%20%E0%A4%B2%E0%A4%BE%E0%A4%87%E0%A4%B8%E0%A5%87%E0%A4%A8%E0%A5%8D%E0%A4%B8%E0%A4%95%E0%A4%BE%20%E0%A4%B2%E0%A4%BE%E0%A4%97%E0%A4%BF%20%E0%A4%9F%E0%A5%8D%E0%A4%B0%E0%A4%BE%E0%A4%AF%E0%A4%B2%20(Nepaltara%20video%20report)_Foi-Q5nzLrM_1080p.mp4?alt=media&token=e63e556e-64c4-4274-bbb7-5b567e762cdb");
        videoView.start();

    }
});





        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                videoView.setVideoPath("https://firebasestorage.googleapis.com/v0/b/nepal-license-9b0ae.appspot.com/o/Car%20Trial%20Test%20in%20Nepal%20ll%20%E0%A4%B8%E0%A4%B5%E0%A4%BE%E0%A4%B0%E0%A5%80%20%E0%A4%9A%E0%A4%BE%E0%A4%B2%E0%A4%95%20%E0%A4%85%E0%A4%A8%E0%A5%81%E0%A4%AE%E0%A4%A4%E0%A5%80%E0%A4%AA%E0%A4%A4%E0%A5%8D%E0%A4%B0%20%E0%A4%AA%E0%A5%8D%E0%A4%B0%E0%A4%BE%E0%A4%AA%E0%A5%8D%E0%A4%A4%20%E0%A4%97%E0%A4%B0%E0%A5%8D%E0%A4%A8%E0%A5%87%20%E0%A4%B8%E0%A4%9C%E0%A4%BF%E0%A4%B2%E0%A5%8B%20%E0%A4%A4%E0%A4%B0%E0%A5%80%E0%A4%95%E0%A4%BE%20ll%20Driving%20License%20Trial.mp4?alt=media&token=95a07a83-0bb1-45b0-8cb1-098772dad812");
                videoView.start();


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

    public boolean testConnection() {
        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] netInfo = cm.getAllNetworkInfo();
        for (NetworkInfo ni : netInfo) {
            if (ni.getTypeName().equalsIgnoreCase("WIFI"))
                if (ni.isConnected())
                    haveConnectedWifi = true;
            if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
                if (ni.isConnected())
                    haveConnectedMobile = true;
        }
        return haveConnectedWifi || haveConnectedMobile;
    }

}








