package com.gzr7702.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/*
    This activity displays the music files that are on the device.
 */

public class DisplayLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_library);
    }
}
