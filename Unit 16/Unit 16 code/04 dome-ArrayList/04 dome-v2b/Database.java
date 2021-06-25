
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
            System.out.println();   // empty line between items
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
   
}
