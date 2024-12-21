/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes;

import java.util.Date;

/**
 *
 * @author Chhing
 */
public class Statistic {
    private int playCount;
    private Date lastPlayed;

    public Statistic(int playCount, Date lastPlayed) {
        this.playCount = playCount;
        this.lastPlayed = lastPlayed;
    }

    public String getStatistic() {
        return "Play Count: " + playCount + ", Last Played: " + lastPlayed;
    }
}
