/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cssummative2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author TRUTH
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        Tutee s1 = new Tutee ("Mattew", 300);
        Tutee s2 = new Tutee ("John", 2000, "English", 78);
        
        Tutor t1 = new Tutor ("Aaron", 500, "Math");
        Tutor t2 = new Tutor ("Danica", 200, "Math");
        Tutor t3 = new Tutor ("Gerson", 500, "English");
        
        ArrayList<String> tuteeList = new ArrayList<>();
        tuteeList.add(s1.getName());
        tuteeList.add(s2.getName());
        
        ArrayList<String> tutorList = new ArrayList<>();
        tutorList.add(t1.getName());
        tutorList.add(t2.getName());
        tutorList.add(t3.getName());
        
        for(int t=0; t<5; t++){
            
            Tutor chosenTutor;
            Tutee chosenTutee;
            boolean haventChosen = true;
            System.out.println("Select a tutee: ");
            String tuteeChoice = sc.nextLine();
            
            while(haventChosen)
            switch (tuteeChoice){
                case "Mattew":
                chosenTutee = s1;
                haventChosen = false;
                break;
                
                case "John":
                chosenTutee = s2;
                haventChosen = false;
                break;
                
                default:
                System.out.println("No tutee named " + tuteeChoice + " is listed.");
                break;
            }
        

            System.out.println("Select a tutor: ");
            String tutorChoice = sc.nextLine();
            switch (tutorChoice){
                case "Aaron":
                chosenTutor = t1;;
                break;
                
                case "Danica":
                chosenTutor = t2;
                break;
                
                case "Gerson":
                chosenTutor = t3;
                break;
                
                default:
                System.out.println("No tutor named " + tutorChoice + " is listed.");
            }
            
        consult(chosenTutor);
    }
    }
}
    
    

