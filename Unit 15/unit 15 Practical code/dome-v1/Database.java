import java.util.ArrayList;

/**
 * The database class provides a facility to store CD and video 
 * objects. A list of all CDs and videos can be printed to the
 * terminal.
 * 
 * 
 */
public class Database
{
    private Item[] items;
    private CD[] cds;
    private DVD[] dvds;
    private int itemPointer = 0;
    private int dvdPointer = 0;
    private int cdPointer = 0;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new Item[10];
        cds = new CD[10];
        dvds = new DVD[10];
    }

    public void addItem(Item theItem) {
        if (itemPointer < items.length) {
            items[itemPointer] = theItem;
        }
        itemPointer++;
    }
    
    /**
     * Add a CD to the database.
     * @param theCD The CD to be added.
     */
    public void addCD(CD theCD)
    {
        if (cdPointer < cds.length){
            cds[cdPointer] = theCD;
        }
        cdPointer++;
    }

    /**
     * Add a DVD to the database.
     * @param theDVD The DVD to be added.
     */
    public void addDVD(DVD theDVD)
    {
        if (dvdPointer < dvds.length){
            dvds[dvdPointer] = theDVD;
        }
        dvdPointer++;
    }

    /**
     * Print a list of all currently stored CDs and DVDs to the
     * text terminal.
     */
    public void list()
    {
        // print list of CDs
        for(int i = 0; i < cdPointer; i++) {
            cds[i].print();
            System.out.println();   // empty line between items
        }

        // print DVDs 
        for(int i = 0; i < dvdPointer; i++) {
            dvds[i].print();
            System.out.println();   // empty line between items
        }
        
        // print Items
        for(int i = 0; i < itemPointer; i++) {
            items[i].print();
            System.out.println();   // empty line between items
        }
    }
}
