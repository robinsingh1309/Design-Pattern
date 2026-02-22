package Behavioral.Iterator.com.example.main;

import Behavioral.Iterator.com.example.iterator.PlaylistIterator;
import Behavioral.Iterator.com.example.playlist.Playlist;


public class IteratorPatternDemo {

    public static void main(String[] args) {

        // Create Playlist
        Playlist playlist = new Playlist();

        playlist.addSong("Hall of Fame");
        playlist.addSong("Legends never Die");
        playlist.addSong("Animals");
        playlist.addSong("Fav Unstoppable"); // to indicate the flow of FavPlaylist
        playlist.addSong("Fav Ignite"); // to indicate the flow of FavPlaylist


        // Simple Playlist songs to be played
        PlaylistIterator simPlaylistIterator = playlist.iterator("simple");
        while (simPlaylistIterator.hasNext()) {
            System.out.println("Simple Playlist: " + simPlaylistIterator.next());
        }


        // Shuffle Playlist songs to be played
        PlaylistIterator shuPlaylistIterator = playlist.iterator("shuffle");
        while (shuPlaylistIterator.hasNext()) {
            System.out.println("Shuffle Playlist: " + shuPlaylistIterator.next());
        }


        // Fav Playlist songs to be played
        PlaylistIterator favPlaylistIterator = playlist.iterator("fav");

        while (favPlaylistIterator.hasNext()) {
            System.out.println("Fav Playlist: " + favPlaylistIterator.next());
        }
    }
}
