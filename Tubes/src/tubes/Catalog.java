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
public class Catalog {
     private int ID;
    private String title;
    private String genre;
    private List<Song> songs;

    public Catalog(int ID, String title, String genre) {
        this.ID = ID;
        this.title = title;
        this.genre = genre;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public String getDetails() {
        return "Catalog ID: " + ID + ", Title: " + title + ", Genre: " + genre + ", Songs Count: " + songs.size();
    }

    public List<Song> getSongs() {
        return songs;
    }
}
