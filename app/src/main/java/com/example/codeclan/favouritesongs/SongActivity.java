package com.example.codeclan.favouritesongs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        Intent intent = getIntent();
        Song song = (Song)intent.getSerializableExtra("song");

        TextView rank = findViewById(R.id.song_rank);
        rank.setText(song.getRank().toString());

        TextView title = findViewById(R.id.song_title);
        title.setText(song.getTitle());

        TextView artist = findViewById(R.id.song_artist);
        artist.setText(song.getArtist());
    }
}
