/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package Exercise2and3;

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
        
        System.out.println("This is " + eula.getName() + ", her birthday is on " + eula.getBirthday() + ".");
        System.out.println("This is " + venti.getName() + ", his birthday is on " + venti.getBirthday() + ".");
        System.out.println("This is " + wanderer.getName() + ", his birthday is on " + wanderer.getBirthday() + ".");
        
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------");
        System.out.println(" ");
        System.out.println(" ");
        
        
        Song againstTheKitchenFloor = new Song("Against the Kitchen Floor");
        Song iMeMyself = new Song("I/Me/Myself");
        Song letMeCarveYourWay = new Song("Let Me Carve Your Way");
        Song smellOfTheGame = new Song("Smell of the Game");
        
        Singer willWood = new Singer("Will Wood", 0, 0, againstTheKitchenFloor);
        Singer daisuke = new Singer("Daisuke Ishiwatari", 0, 0, letMeCarveYourWay);
        
        System.out.println("Singer 1:");
        System.out.println("Name: " + willWood.getName());
        System.out.println("Earnings: " + willWood.getEarnings());
        System.out.println("Number of Performances: " + willWood.getPerformances());
        System.out.println("Favorite Song: " + willWood.getFavSong().getTitle());
        
        System.out.println("");
        
        System.out.println("Singer 2:");
        System.out.println("Name: " + daisuke.getName());
        System.out.println("Earnings: " + daisuke.getEarnings());
        System.out.println("Number of Performances: " + daisuke.getPerformances());
        System.out.println("Favorite Song: " + daisuke.getFavSong().getTitle());
        
        System.out.println("");
        
        System.out.println("Total performances: " + daisuke.getTotalPerformances());
        
        System.out.println("");
        System.out.println("");
        
        daisuke.performForAudience(20);
        
        willWood.performForAudience(15);
        
        willWood.performForAudience(30, daisuke);
        
        daisuke.changeFavSong(smellOfTheGame);
        
        willWood.changeFavSong(iMeMyself);
        
        System.out.println("");
        
        System.out.println("Singer 1:");
        System.out.println("Name: " + willWood.getName());
        System.out.println("Earnings: " + willWood.getEarnings());
        System.out.println("Number of Performances: " + willWood.getPerformances());
        System.out.println("Favorite Song: " + willWood.getFavSong().getTitle());
        
        System.out.println("");
        
        System.out.println("Singer 2:");
        System.out.println("Name: " + daisuke.getName());
        System.out.println("Earnings: " + daisuke.getEarnings());
        System.out.println("Number of Performances: " + daisuke.getPerformances());
        System.out.println("Favorite Song: " + daisuke.getFavSong().getTitle());
        
        System.out.println("");
        
        System.out.println("Total performances: " + daisuke.getTotalPerformances());
    }
    
} 
