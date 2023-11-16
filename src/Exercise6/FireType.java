package Exercise6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUTH
 */
public class FireType extends SimpleMonster{
    public FireType(String n, int m, int b){
        super(n, "Fire", "Grass", "Water", m, b);
        atk *= 1.3 * b;
        def *= 0.7 * b;
    }
    
    @Override
    public void special(){
    System.out.println(getName() + " did a pose.");
    atk += 2;
    hp -= 0.1 * maxHP;
    }
}