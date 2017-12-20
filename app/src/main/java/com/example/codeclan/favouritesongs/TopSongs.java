package com.example.codeclan.favouritesongs;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2017.
 */

public class TopSongs {
    ArrayList<Song> topSongs;

    public TopSongs() {
        this.topSongs = new ArrayList<>();
        topSongs.add(new Song(1, "All Along the Watchtower", "Jimi Hendrix"));
        topSongs.add(new Song(2, "Voodoo Child(Slight Return)", "Jimi Hendrix"));
        topSongs.add(new Song(3, "Hey Joe", "Jimi Hendrix"));
        topSongs.add(new Song(4, "Manic Depression", "Jimi Hendrix"));
        topSongs.add(new Song(5, "Little Wing", "Jimi Hendrix"));
        topSongs.add(new Song(6, "Kashmir", "Led Zeppelin"));
        topSongs.add(new Song(7, "War Pigs", "Black Sabbath"));
        topSongs.add(new Song(8, "Iron Man", "Black Sabbath"));
        topSongs.add(new Song(9, "Bang a Gong", "T Rex"));
        topSongs.add(new Song(10, "20th Century Boy", "T Rex"));
        topSongs.add(new Song(11, "Itchycoo Park", "The Small Faces"));
        topSongs.add(new Song(12, "Wake Up", "RATM"));
        topSongs.add(new Song(13, "All Day and All Of The Night", "The Kinks"));
        topSongs.add(new Song(14, "Train in Vain", "The Clash"));
        topSongs.add(new Song(15, "Rock the Casbah", "The Clash"));
        topSongs.add(new Song(16, "Rebel Rebel", "David Bowie"));
        topSongs.add(new Song(17, "Paint it Black", "The Rolling Stones"));
        topSongs.add(new Song(18, "Give Me Shelter", "The Rolling Stones"));
        topSongs.add(new Song(19, "Straight Outta Compton", "N.W.A."));
        topSongs.add(new Song(20, "Boyz in da Hood", "Eazy-e"));
        topSongs.add(new Song(21, "Downtown Swinga '94", "M.O.P."));
    }

    public ArrayList<Song> getList() {
        return new ArrayList<Song>(topSongs);
    }
}
