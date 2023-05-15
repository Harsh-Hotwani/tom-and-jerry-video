package com.example.videoplayinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView tom = findViewById(R.id.tom);
        tom.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.tomandjerry);
        MediaController media = new MediaController(this);
        tom.setMediaController(media);
        media.setAnchorView(tom);
        tom.start();
    }
}