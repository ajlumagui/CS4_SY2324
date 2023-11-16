/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cssummative2;

/**
 *
 * @author TRUTH
 */
public class Tutor {
    private String name;
    private double rate;
    private double earnings;
    private String specialization;
    
    public Tutor(String n, double r, String s){
    name = n;
    rate = r;
    specialization = s;
    earnings = 0;
    }
    
    public void addEarnings(){
        earnings += rate;
    }
    
    public String getName(){
        return name;
    }
    public double getRate(){
        return rate;
    }
    
    public double getEarnings(){
        return earnings;
    }
    
    public String getSpecialization(){
        return specialization;
    }
    
    
}
