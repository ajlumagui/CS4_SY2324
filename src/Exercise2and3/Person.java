/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2and3;

/**
 *
 * @author TRUTH
 */
public class Person {
    private String name;
    private String birthday;

    
    public Person(String n, String b) {
        name = n;
        birthday = b;
    }
    
    public String getName(){
        return name;
    }
    public String getBirthday(){
        return birthday;
    }
}