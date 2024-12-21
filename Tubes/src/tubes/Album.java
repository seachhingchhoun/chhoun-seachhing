/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chhing
 */
public class Album {
    private int releaseYear;
    private Artist artist;
    private List<Song> songs;

    public Album(int releaseYear, Artist artist) {
        this.releaseYear = releaseYear;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public String getDetails() {
        return "Album Release Year: " + releaseYear + ", Songs: " + songs.size();
    }

    public List<Song> getSongs() {
        return songs;
    }
}
