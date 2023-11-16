/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cssummative;

import java.util.Scanner;

/**
 *
 * @author staff
 */
public class Main {
    public static void main(String[] args){
        // You are writing in the main method of the application. You may wish to copy-paste segments of the code as you're working on it to avoid the errors in the latter part of the file.
        
        // You've decided that there are 5 devices that can be used in application:
        // Smartphone: 10 watts
        // Laptop: 60 per unit
        // Desktop: 80 per unit
        // TV: 100 per unit
        // Aircon: 500 per unit
        
        Electronics elec1 = new Electronics("Smartphone", 10);
        Electronics elec2 = new Electronics("Laptop", 60);
        Electronics elec3 = new Electronics("Desktop", 80);
        Electronics elec4 = new Electronics("TV", 100);
        Electronics elec5 = new Electronics("Aircon", 500);
        
        // Create instances of the indicated electronics. Assign them to variables elec1, elec2, elec3, etc.
        // Score: 5pts
        
        Scanner scan = new Scanner(System.in);
        Person joe = new Person("Joe");
        Person jane =  new Person("Jane");
        
        // For the remainder of the problem, simply replace the blank spaces with the appropriate code to make the application work.
        int totalWattage = integer.parseInt(joe.getTotalWattHours());
        // Application will loop for as long as the total wattage is under 5000.
        while(totalWattage>5000){
            Person selectedPerson = null;
            System.out.print("Who will use a device, Joe or Jane?");
            String name = scan.nextLine();
            
            switch(name){
                case "Joe":
                    selectedPerson = joe;
                    break;
                case "Jane":
                    selectedPerson = jane;
                    break;
                default:
                    System.out.println("Invalid input");
                    continue;
            }
            
            Electronics selectedElectronics = null;
            System.out.printf("What expense will %s spend on? ", selectedPerson.getName());
            String activity =  scan.nextLine();
            
            switch(activity){
                case "Smartphone":
                    selectedElectronics = elec1;
                    break;
                case "Laptop":
                    selectedElectronics = elec2;
                    break;
                case "Desktop":
                    selectedElectronics = elec3;
                    break;
                case "TV":
                    selectedElectronics = elec4;
                    break;
                case "Aircon":
                    selectedElectronics = elec5;
                    break;
                default:
                    System.out.println("Invalid input");
                    continue;
            }
            
            // Expercted output: How long will <person's name> use <electronic's name>?
            System.out.printf("How long will %s use the %s? ", name, selectedElectronics.getName());
            int units =  Integer.parseInt(scan.nextLine());
            
            // The selected person will use the specified electronics of the selected duration.
            selectedPerson.use(selectedElectronics, units);
        }
        
        joe.analyzeConsumption();
        jane.analyzeConsumption();
        
    }
}
