/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2;

/**
 *
 * @author TRUTH
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    public Singer(String n, int p, double e, Song s) {
        name = n;
        noOfPerformances = p;
        earnings = e;
        favoriteSong = s;
    }
    public void performForAudience(int n){
        noOfPerformances++;
        earnings += n*100;
        
        System.out.println("Performed for " + n + " people!");
        System.out.println("Earned " + earnings + "!");
    }
    public void changeFavSong(Song a){
        favoriteSong = a;
    }
}
