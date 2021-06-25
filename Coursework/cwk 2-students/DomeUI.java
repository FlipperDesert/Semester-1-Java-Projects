import java.util.*;
/**
 * Creates a text-based UI which runs functions from Dome()
 * 
 * @author (J Reece) 
 * @version (16/12/19)
 */
public class DomeUI
{
    private Scanner reader = new Scanner(System.in);
    private Controller paradise = new Dome("Paradise Park Dome");
    
    /**
     * Offers a list of functions taking 1-10 as inputs.
     */
    public void doTest()
    {   
        
        int choice = getOption();        
        while (choice != 0)
        {            
            // process choice
            if      (choice == 1){displayDome();}
            else if (choice == 2){listAllCaverns();}
            else if (choice == 3){listOneCavern();}
            else if (choice == 4){listCavernNames();}
            else if (choice == 5){findPass();}
            else if (choice == 6){enterCavern();}
            // Task 6 only
            else if (choice == 7){addTokens();}
            else if (choice == 8){convertPts();}
            else if (choice == 9){goOutside();}
            else if (choice == 10){evacuate();}
            // output menu & get choice
            choice = getOption();
        }
    }
    
    
    /**
     * Takes a user input and returns the function chosen
     */
    private int getOption()
    {
       System.out.println("What would you like to do ?");
       System.out.println("0. Quit");
       System.out.println("1. Display the dome");
       System.out.println("2. List all passes in all caverns");
       System.out.println("3. List all passes in one cavern");
       System.out.println("4. List Cavern names");
       System.out.println("5. Find a pass");
       System.out.println("6. Enter a cavern");
       // Task 6 only
       System.out.println("7. Top up credits");
       System.out.println("8. Convert points to tokens - Gold only");
       System.out.println("9. move pass to outside");
       System.out.println("10. Evacuate all");

       System.out.println("Enter your choice");
       // read choice
       int option = reader.nextInt();
       reader.nextLine();
       return option;
    }
    
    // Provide the functionality for the above menu
    
    // This one has been done for you
    /**
     * Displays all current information about the Dome
     */
    public void displayDome()
    {
        System.out.println(paradise.toString());
    }    
    
    /**
     * Lists all Caverns and current Passes inside each
     */
    public void listAllCaverns()
    {
        System.out.println(paradise.passesInAllCaverns());
    }
    
    /**
     * Provides current information about one cavern
     */
    public void listOneCavern()
    {
        System.out.println("Enter name of cavern: ");
        String id = reader.next();
        System.out.println(paradise.passesInCavern(id));
        
    }  
    
    /**
     * Lists the names of all caverns
     */
    public void listCavernNames()
    {
        System.out.println(paradise.getCavernNames());    
    }
        
        
    /**
     * Finds a pass and returns its current location
     */
    public void findPass()
    {
        System.out.println("Enter pass id: ");
        int id = reader.nextInt();
        System.out.println(paradise.findPass(id));
    }
    
    /**
     * Moves a pass through a door connected to its current Cavern
     */
    public void enterCavern()
    {
        System.out.println("Enter pass id: ");
        int id = reader.nextInt();
        System.out.println("Enter door number: ");
        int dr = reader.nextInt();
        System.out.println(paradise.enterCavern(id,dr));
    }    
    
   
    // Task 6 only
    /**
     * Adds tokens to one Pass
     */   
    public void addTokens()
    {
        System.out.println("Enter pass id:");
        int id = reader.nextInt();
        System.out.println("Enter token value:");
        int tkns = reader.nextInt();
        paradise.topUpTokens(id, tkns);
        System.out.println(tkns + " tokens added for " + id); 
    }
      
    /**
     * Converts 5 loyalty points into 1 token for one Pass
     */
    public void convertPts()
    {
        System.out.println("Enter pass id: ");
        int id = reader.nextInt();
        paradise.convertPoints(id);
        System.out.println("Points converted for: " + id);
    }
   
   
    /**
     * Takes a single Pass and places it in the Outside Cavern
     * with no tokens deducted
     */
    public void goOutside()
    {
        System.out.println("Enter pass id:");
        int id = reader.nextInt();
        paradise.moveToOutside(id);
        System.out.println(id + " is evacuated to outside");
    }
   
    /**
     * Moves every pass to the Outside Cavern with no tokens deducted
     */
    public void evacuate()
    {
        paradise.moveAll();
        System.out.println(" All evacuated to outside");
    }

    public static void main(String[] args)
    {
        new DomeUI().doTest();
    }
}
