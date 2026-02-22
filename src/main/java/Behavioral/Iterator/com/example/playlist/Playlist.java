package Behavioral.Iterator.com.example.playlist;

import java.util.ArrayList;

import Behavioral.Iterator.com.example.iterator.PlaylistIterator;
import Behavioral.Iterator.com.example.iterator.impl.FavPlaylistIterator;
import Behavioral.Iterator.com.example.iterator.impl.ShuffledPlaylistIterator;
import Behavioral.Iterator.com.example.iterator.impl.SimplePlaylistIterator;


public class Playlist {

    // Fields

    private ArrayList<String> songs;


    // Constructors
    // -----------------------------------------------------

    public Playlist() {
        songs = new ArrayList<String>();
    }


    // Methods
    // -----------------------------------------------------

    public void addSong(String songName) {
        songs.add(songName);
    }

    public PlaylistIterator iterator(String iterator) {

        String iteratorType = iterator.trim().toLowerCase();

        switch (iteratorType) {
            case "simple":
                return new SimplePlaylistIterator(this);
            case "shuffle":
                return new ShuffledPlaylistIterator(this);
            case "fav":
                return new FavPlaylistIterator(this);
            default:
                throw new IllegalArgumentException("Unexpected Iterator type passed: " + iterator);
        }

    }


    // Getters
    // -----------------------------------------------------

    public ArrayList<String> getSongs() {
        return songs;
    }

}
