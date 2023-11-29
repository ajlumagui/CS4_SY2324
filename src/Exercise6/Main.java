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
        FireType scorbunny = new FireType ("Scorbunny", 50, 20);
        WaterType sobble = new WaterType ("Sobble", 50, 20);
        GrassType grookey = new GrassType ("Grookey", 50, 20);
        
        while(scorbunny.getHP() > 0 && grookey.getHP() > 0){
            grookey.attack(scorbunny);
            scorbunny.attack(grookey);
            
        }
        
        scorbunny.restoreHealth();
        grookey.restoreHealth();
        
        while(sobble.getHP() > 0 && scorbunny.getHP() > 0){
            scorbunny.attack(sobble);
            sobble.attack(scorbunny);
            
        }
        
        scorbunny.restoreHealth();
        sobble.restoreHealth();
        
        while(grookey.getHP() > 0 && sobble.getHP() > 0){
            sobble.attack(grookey);
            grookey.attack(sobble);            
        }
        
        sobble.restoreHealth();
        grookey.restoreHealth();
    }
    
}
