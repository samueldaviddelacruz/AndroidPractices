package com.practices.samuel.youtubeplayerandroidstudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSingle;
    private Button btnStandALone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSingle = (Button) findViewById(R.id.btnSingle);
        btnStandALone = (Button) findViewById(R.id.btnStandAlone);
        btnSingle.setOnClickListener(this);
        btnStandALone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch(view.getId()){
            case R.id.btnSingle:
                intent = new Intent(MainActivity.this,YouTubeActivity.class);
                break;
            case R.id.btnStandAlone:
                intent = new Intent(MainActivity.this,StandAloneActivity.class);
                break;

            default:

        }
        if(intent != null){
            startActivity(intent);

        }
    }
}
