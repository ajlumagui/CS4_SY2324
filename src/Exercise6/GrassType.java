/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise6;

/**
 *
 * @author TRUTH
 */
public class GrassType extends SimpleMonster{
    public GrassType(String n, int m, int b){
        super(n, "Grass", "Water", "Fire", m, b);
    }
    
    @Override
    public void special(){
    System.out.println(getName() + " did a pose.");
    hp += 0.2 * maxHP;
    }
    
    @Override
    public void rest(){
        System.out.println(getName() + " rested.");
        hp += 0.5 * maxHP;
    }
}