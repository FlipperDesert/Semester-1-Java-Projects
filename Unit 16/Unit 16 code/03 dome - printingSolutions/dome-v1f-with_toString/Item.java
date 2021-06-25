
public class Item
{
    private String title;
    private int playingTime;
    private String comment;
    private boolean gotIt;

    /**
     * Initialise the fields of the item.
     * @param theTitle The title of this item.
     * @param time The running time of this item.
     */
    public Item(String theTitle, int time)
    {
        title = theTitle;
        playingTime = time;
        comment = "";
        gotIt = false;
    }

    /**
     * Enter a comment for this item.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @return The comment for this item.
     */
    public String getComment()
    {
        return comment;
    }

       
    /**
     * @returns the title
     */
    public String getTitle()
    {
        return title;
    }


    /**
     * Print details about this item to the text terminal.
     */
    public void print()
    {
        System.out.print("DVD: " + title + " (" + playingTime + " mins)");
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
     
//      /**
//      * returns details about the Item .
//      */
//     public String toString()
//     {
//        String s = "";
//        s = s+"Item: " + title + " (" + playingTime + " mins)";
//        if(gotIt) 
//        {
//           s = s + "*";
//        }
//        s = s + "\n    " + comment;
//        return s;
//     }
    

}
