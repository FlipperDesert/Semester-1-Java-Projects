

/**
 * The database class provides a facility to store entertainment
 * item objects. A list of all items can be printed to the
 * terminal.
 * 
 */
public class Database
{
    private Item[] items;
    private int itemPointer = 0;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new Item[20];
    }

    /**
     * Add an item to the database.
     * @param theItem The item to be added.
     */
    public void addItem(Item theItem)
    {
        if (itemPointer < items.length){
            items[itemPointer] = theItem;
        }
        itemPointer++;
    }

    /**
     * Print a list of all currently stored items to the
     * text terminal.
     */
    public void list()
    {
        for(int i = 0; i < itemPointer; i ++) {
            items[i].print();
            System.out.println();   // empty line between items
        }
    }
}
