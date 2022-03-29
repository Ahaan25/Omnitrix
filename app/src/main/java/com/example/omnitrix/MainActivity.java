package com.example.omnitrix;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;


public class MainActivity extends Activity {
    public MediaPlayer launchsound=MediaPlayer.create(this, R.raw.omnitrixlaunchsound);

    private static int sp=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launchsound.start();
        launchsound.stop();
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent homeIntent=new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, sp);
    }
}