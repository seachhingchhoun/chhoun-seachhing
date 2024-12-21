package tubes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chhing
 */
public class Song {
    private String title;
    private Artist artist;
    private String album;
    private double duration;
    private int playCount;

    public Song(String title, Artist artist, String album, double duration) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.playCount = 0;
    }

    public void play() {
        playCount++;
    }

    public String getDetails() {
        return "Song: " + title + ", Artist: " + artist.getDetails() +
               ", Album: " + album + ", Duration: " + duration + " mins, Plays: " + playCount;
    }
}
