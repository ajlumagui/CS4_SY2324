/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cssummative;

/**
 *
 * @author staff
 */
public class Electronics {
    private String name;
    private double wattage, hours;
    private static double totalHours = 0;
    
    public Electronics(String name, double wattage){
        this.name = name;
        this.wattage = wattage;
        this.hours = 0;
    }
    
    public String getName(){
        return this.name;
    }
    public double getWattage(){
        return this.wattage;
    }
    public void setWattage(double wattage){
        this.wattage = wattage;
    }
    public double getHours(){
        return this.hours;
    }
    public void operate(double hours){
        this.hours += hours;
        totalHours += hours;
    }
}
