package com.gzr7702.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        TextView titleView = (TextView) findViewById(R.id.song_title_text);

        Intent intent = getIntent();
        String title = intent.getStringExtra("songTitle");
        titleView.setText(title);
    }
}
