package Behavioral.Iterator.com.example.iterator.impl;

import java.util.ArrayList;
import java.util.stream.Collectors;

import Behavioral.Iterator.com.example.iterator.PlaylistIterator;
import Behavioral.Iterator.com.example.playlist.Playlist;


public class FavPlaylistIterator implements PlaylistIterator {

    // Fields

    private final ArrayList<String> favSongsPlaylist;
    private int index;


    // Constructors
    // ------------------------------------------------------------

    public FavPlaylistIterator(final Playlist playlist) {

        this.favSongsPlaylist = playlist.getSongs() //
                .stream() //
                .filter(song -> song.contains("Fav")) //
                .collect(Collectors.toCollection(ArrayList::new));

        this.index = 0;
    }


    // Methods
    // ------------------------------------------------------------

    @Override
    public boolean hasNext() {
        return index < favSongsPlaylist.size();
    }

    @Override
    public String next() {
        return favSongsPlaylist.get(index++);
    }


}
