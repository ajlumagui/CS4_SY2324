/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercise6;

/**
 *
 * @author TRUTH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FireType charmander = new FireType ("Charmander", 10, 10);
        WaterType squirtle = new WaterType ("Squirtle", 10, 10);
        GrassType bulbasaur = new GrassType ("Bulbasaur", 10, 10);
        
        while(charmander.getHP() > 0 || bulbasaur.getHP() > 0){
            attack(charmander);
            attack(bulbasaur);
            
        }
    }
    
}
