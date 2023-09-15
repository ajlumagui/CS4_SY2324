/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package Exercise2;

/**
 *
 * @author TRUTH
 */
public class exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person eula = new Person("Eula Lawrence", "October 25");
        Person venti = new Person("Venti", "June 16");
        Person wanderer = new Person("Wanderer", "January 3");
        
        System.out.println("This is " + eula.name + ", her birthday is on " + eula.birthday + ".");
        System.out.println("This is " + venti.name + ", his birthday is on " + venti.birthday + ".");
        System.out.println("This is " + wanderer.name + ", his birthday is on " + wanderer.birthday + ".");
        
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------");
        System.out.println(" ");
        System.out.println(" ");
        
        
        Song againstTheKitchenFloor = new Song("Against the Kitchen Floor");
        Song iMeMyself = new Song("I/Me/Myself");
        
        Singer willWood = new Singer("Will Wood", 0, 0, againstTheKitchenFloor);
        
        System.out.println("Artist Name: " + willWood.name);
        System.out.println("# of Performances: " + willWood.noOfPerformances);
        System.out.println("Earnings: " + willWood.earnings);
        System.out.println("Favorite Song: " + willWood.favoriteSong.title);
        
        System.out.println(" ");
        
        willWood.changeFavSong(againstTheKitchenFloor);
        willWood.performForAudience(15);
        willWood.changeFavSong(iMeMyself);
        
        System.out.println(" ");
        
        System.out.println("Artist Name: " + willWood.name);
        System.out.println("# of Performances: " + willWood.noOfPerformances);
        System.out.println("Earnings: " + willWood.earnings);
        System.out.println("Favorite Song: " + willWood.favoriteSong.title);
    }
    
} 
