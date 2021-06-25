
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    private String title;
    private boolean gotIt;
    private int playingTime;
    private String comment;
    
    /**
     * Constructor for objects of class item
     * @param theTitle The title of this item.
     * @param time The running time of the main feature.
     */
    public Item(String theTitle, int time)
    {
        title = theTitle;
        playingTime = time;
        gotIt = false;
        comment = "<no comment>";
    }
    
    /**
     * Enter a comment for this disk.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @return The comment for this disk.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this disk.
     * @param ownIt true if we own the disk, false otherwise.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * @return true if we own a copy of this disk.
     */
    public boolean getOwn()
    {
        return gotIt;
    }
    
    public void print() {
        System.out.print("Item: " + title + " (" + playingTime + " mins)");
        
        if(gotIt) 
        {
            System.out.println("*");
        }
        else 
        {
            System.out.println();
        }
        System.out.println("    " + comment);
    }
    
    /**
     * returns details about this Item .
     */
    public String toString()
    {
       String s = "";
       s = s + "Item: " + title + " (" + playingTime + " mins)";
       if(gotIt) 
       {
          s = s + "*";
       }
       s = s + "\n    " + comment;
       return s;
    }
}
