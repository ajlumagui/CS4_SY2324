/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity1;

/**
 *
 * @author TRUTH
 */
public class exercise1 {
    
    public static void main(String[] args){
        String char1 = "Seele";
        String element1 = "Quantum";
        int release1 = 137;    
    
        String char2 = "Kafka";
        String element2 = "Lightning";
        int release2 = 31;
    
        String char3 = "Dan Heng: Imbibitor Lunae";
        String element3 = "Imaginary";
        int release3 = 10;
    
        System.out.println("Character 1");
        System.out.println("Name: " + char1);
        System.out.println("Element: " + element1);
        System.out.println("Days since release: " + release1);
    
        System.out.println("Character 2");
        System.out.println("Name: " + char2);
        System.out.println("Element: " + element2);
        System.out.println("Days since release: " + release2);
    
        System.out.println("Character 3");
        System.out.println("Name: " + char2);
        System.out.println("Element: " + element2);
        System.out.println("Days since release: " + release2);
    
        System.out.println("Total days released: " + (release1 + release2 + release3));
        
        System.out.print("Seele is the earliest released: ");
        if(release1>release2+release3){
                System.out.println("True");
        } else System.out.println("False");
        System.out.print("The characters all have the same element: ");
        if(element1==element2){
            System.out.print("True");
        } else System.out.print("False");
    }
}
