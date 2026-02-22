package Behavioral.Iterator.com.example.iterator.impl;

import java.util.ArrayList;
import java.util.Collections;

import Behavioral.Iterator.com.example.iterator.PlaylistIterator;
import Behavioral.Iterator.com.example.playlist.Playlist;


public class ShuffledPlaylistIterator implements PlaylistIterator {

    // Fields

    private final ArrayList<String> shuffledSongsPlaylist;
    private int index;


    // Constructors
    // ------------------------------------------------------------

    public ShuffledPlaylistIterator(final Playlist playlist) {

        this.shuffledSongsPlaylist = new ArrayList<String>(playlist.getSongs());
        Collections.shuffle(shuffledSongsPlaylist);

        this.index = 0;
    }


    // Methods
    // ------------------------------------------------------------

    @Override
    public boolean hasNext() {
        return index < shuffledSongsPlaylist.size();
    }

    @Override
    public String next() {
        return shuffledSongsPlaylist.get(index++);
    }


}
