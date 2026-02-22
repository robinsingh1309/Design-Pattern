package Behavioral.Iterator.com.example.iterator.impl;

import Behavioral.Iterator.com.example.iterator.PlaylistIterator;
import Behavioral.Iterator.com.example.playlist.Playlist;


public class SimplePlaylistIterator implements PlaylistIterator {

    // Fields

    private final Playlist playlist;
    private int index;


    // Constructors
    // ------------------------------------------------------------

    public SimplePlaylistIterator(final Playlist playlist) {

        this.playlist = playlist;
        this.index = 0;
    }


    // Methods
    // ------------------------------------------------------------

    @Override
    public boolean hasNext() {
        return index < playlist.getSongs().size();
    }

    @Override
    public String next() {
        return playlist.getSongs().get(index++);
    }


}
