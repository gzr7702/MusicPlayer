package com.gzr7702.musicplayer;

import android.content.Intent;
import android.support.constraint.solver.ArrayLinkedVariables;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/*
    This activity displays the music files that are on the device.
 */

public class DisplayLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_library);

        ArrayAdapter adapter = new ListAdapter(this, generateData());

        final ListView listView = (ListView) findViewById(R.id.music_list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent playIntent = new Intent(getApplicationContext(), PlayActivity.class);
                playIntent.putExtra("songTitle", "hello");
                startActivity(playIntent);
            }
        });

        listView.setAdapter(adapter);
    }

    private ArrayList<SongItem> generateData() {
        ArrayList<SongItem> songs = new ArrayList<SongItem>();
        songs.add(new SongItem("Song List"));
        songs.add(new SongItem(R.drawable.audio_file, "Stairway to Heaven"));
        songs.add(new SongItem(R.drawable.audio_file, "Let's Dance"));
        songs.add(new SongItem(R.drawable.audio_file, "Master of Puppets"));
        songs.add(new SongItem(R.drawable.audio_file, "Live till You Die"));
        songs.add(new SongItem(R.drawable.audio_file, "Umbrella"));
        songs.add(new SongItem(R.drawable.audio_file, "Rolling in the Deep"));
        songs.add(new SongItem(R.drawable.audio_file, "Just Dance"));
        songs.add(new SongItem(R.drawable.audio_file, "Whiskey in the Jar"));
        songs.add(new SongItem(R.drawable.audio_file, "Mr. Brightside"));
        songs.add(new SongItem(R.drawable.audio_file, "War Pigs"));
        songs.add(new SongItem(R.drawable.audio_file, "Ghost Town"));
        songs.add(new SongItem(R.drawable.audio_file, "Message in a Bottle"));
        songs.add(new SongItem(R.drawable.audio_file, "Billie Jean"));
        songs.add(new SongItem(R.drawable.audio_file, "Bohemian Rhapsody"));

        return songs;
    }
}
