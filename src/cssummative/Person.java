/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cssummative;



/**
 *
 * @author staff
 */
public class Person {
    private final String name;
    private String electricBill;
    private double wattHours;
    private static double totalWattHours = 0;
    
    public Person(String name){
        this.name = name;
        this.electricBill = "";
        this.wattHours = 0;
    }
    public String getName(){
        return this.name;
    }
    public double getWattHours(){
        return this.wattHours;
    }
    
    public double getTotalWattHours(){
        return this.totalWattHours;
    }
    
    public void use(Electronics device, double hours){
        electricBill += device.getName() + ": " + hours + " hour(s);\n";
        device.operate(hours);
        this.wattHours += hours * device.getWattage();
        this.totalWattHours += hours * device.getWattage();
        System.out.printf ("%s used %s for %s hour(s)", this.getName(), device.getName(), hours);
        // add code here such that:
        // the device is operated for the specified number of hours
        // wattHours is increased by the device's wattage multiplied by the hours used
        // totalWattHours is increased by the device's wattage multiplied by the hours used
        // a statement is printed stating that: "<person's name> used <device's name> for <duration> hour(s)."
        // Score: 4pts
    }
    public void analyzeConsumption(){
        // add code here such that:
        // it prints the electricBill of the person
        // it prints the following depending on the percentage of wattHours compated to the total watt hours
        //      small consumption: watt hours are less than 15% of the total watt hours
        //      moderate consumption: watt hours are greater than 15% of the total watt hours but less than 30%
        //      big consumption: watt hours are greater than 30% of the total watt hours but less than 50%
        //      majority consumption: watt hours are 50% or greater than the total watt hours
        // Score: 4pts
        System.out.println(electricBill);
        if(this.wattHours >= totalWattHours*0.5){
            System.out.println("Majority Consumption");
        } else if(this.wattHours >= totalWattHours*0.3){
            System.out.println("Big Consumption");
        } else if(this.wattHours >= totalWattHours*0.15){
            System.out.println("Moderate Consumption");
        } else if(this.wattHours < totalWattHours*0.15){
            System.out.println("S,all Consumption");
        }
    }
}
