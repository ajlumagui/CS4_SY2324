/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2and3;

/**
 *
 * @author TRUTH
 */
public class Singer {
    private String name;
    private static int totalPerformances;
    private double thisEarnings;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    public Singer(String n, int p, double e, Song s) {
        name = n;
        noOfPerformances = p;
        earnings = e;
        favoriteSong = s;
    }
    public void performForAudience(int n){
        totalPerformances++;
        noOfPerformances++;
        thisEarnings = n*100;
        earnings += thisEarnings;
        
        System.out.println(getName() + " performed for " + n + " people!");
        System.out.println(getName() + " earned " + earnings + "!");
    }
    public void performForAudience(int n, Singer os){
        totalPerformances++;
        noOfPerformances++;
        thisEarnings = n*50;
        earnings += thisEarnings;
        os.noOfPerformances ++;
        os.earnings += thisEarnings;
        
        
        System.out.println(getName() + " and " + os.getName() + " performed for " + n + " people!");
        System.out.println("Each singer earned " + thisEarnings + "!");
        System.out.println("");
    }
    public void changeFavSong(Song a){
        favoriteSong = a;
        System.out.println(getName() + " changed their favorite song to " + favoriteSong.getTitle() + ".");
        System.out.println("");
    }
    public String getName(){
        return name;
    }
    public int getPerformances(){
        return noOfPerformances;
    }
    public int getTotalPerformances(){
        return totalPerformances;
    }
    public double getEarnings(){
        return earnings;
    }
    public Song getFavSong(){
        return favoriteSong;
    }
    
}
