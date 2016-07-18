package com.practices.samuel.youtubeplayerandroidstudio;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandAloneActivity extends AppCompatActivity implements View.OnClickListener {

    private String GOOGLE_API_KEY = "AIzaSyBAsKiH5qrzzRic4i6H0RnQYs-fRcZ1mjE";
    private String YOUTUBE_VIDEO_ID = "mqnnNjWc2F4";
    private String YOUTUBE_PLAYLIST = "RDdxnlJGbgmC8";
    private Button btnPlayVideo;
    private Button btnPlayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stand_alone);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnPlayVideo = (Button) findViewById(R.id.btnPlayVideo);
        btnPlayList = (Button) findViewById(R.id.btnPlayList);

        btnPlayVideo.setOnClickListener(this);
        btnPlayList.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent intent = null;
        switch(view.getId()){
            case R.id.btnPlayVideo:
                intent = YouTubeStandalonePlayer.createVideoIntent(this,GOOGLE_API_KEY,YOUTUBE_VIDEO_ID);
                break;
            case R.id.btnPlayList:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this,GOOGLE_API_KEY,YOUTUBE_PLAYLIST);
                break;

            default:

        }
        if(intent != null){
            startActivity(intent);

        }

    }
}
