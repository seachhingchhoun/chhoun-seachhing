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
public class Artist {
    private String name;
    private String country;
    private List<Album> albums;

    public Artist(String name, String country) {
        this.name = name;
        this.country = country;
        this.albums = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public String getDetails() {
        return "Artist: " + name + ", Country: " + country + ", Albums Count: " + albums.size();
    }

    public List<Album> getAlbums() {
        return albums;
    }
}
