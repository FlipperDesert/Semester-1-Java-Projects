
import java.util.*;
/**
 * The database class provides a facility to store entertainment
 * item objects. A list of all items can be printed to the
 * terminal.
 * 
 */
public class Database
{
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Add an item to the database.
     * @param theItem The item to be added.
     */
    public void addItem(Item theItem)
    {
            items.add(theItem);
    }

    /**
     * Print a list of all currently stored items to the
     * text terminal.
     */
    public void list()
    {
        for(Item temp: items) {
            temp.print();
        }
    }
    
    /** using toString()
     */
    public void list2()
    {   
        for(Item temp: items) {
            System.out.println(temp.toString());
        }
    }
    
    /** Calling parent method
     * 
     */
    public void setAllOwn(){
        for(Item temp: items) {
            temp.setOwn(true);  
        }
    }
    
    /** lists all CD no of tracks - ONLY way to do this
     */
    public void listAllTracks()
    {   
        for(Item temp: items) {
            if (temp instanceof CD)
            {
                // need to use casting: cast the object, then call the method
                System.out.println(((CD)temp).getNumberOfTracks());
            }
        }
    }
    
    
    /** get Makers
     * 
     */
    
    public void listAllMakers()
    {   
        for(Item temp: items) {
           System.out.println(temp.getMaker());
            }
    }
}
