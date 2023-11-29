/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise6;

/**
 *
 * @author TRUTH
 */
public class WaterType extends SimpleMonster{
    public WaterType(String n, int m, int b){
        super(n, "Water", "Fire", "Grass", m, b);
        atk *= 0.7;
        def *= 1.3;
    }
    
    @Override
    public void special(){
    System.out.println(getName() + " did a pose.");
    def += 2;
    hp -= 0.1 * maxHP;
    }
}
