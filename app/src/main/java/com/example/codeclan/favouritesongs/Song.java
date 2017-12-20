package com.example.codeclan.favouritesongs;

import java.io.Serializable;

/**
 * Created by user on 19/12/2017.
 */

public class Song implements Serializable {
    private Integer rank;
    private String title;
    private String artist;

    public Song(Integer inputRank, String inputTitle, String inputArtist) {
        this.rank = inputRank;
        this.title = inputTitle;
        this.artist = inputArtist;
    }

    public Integer getRank() {
        return rank;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
