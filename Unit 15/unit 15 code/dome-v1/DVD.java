/**
 * The DVD class represents a DVD object. Information about the 
 * DVD is stored and can be retrieved. We assume that we only deal 
 * with movie DVDs at this stage.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2006.03.30 amended by A.A.Marczyk 2007.12.01
 */
public class DVD 
{
    private String title;
    private String director;
    private int playingTime; // playing time of the main feature
    private boolean gotIt;
    private String comment;

    /**
     * Constructor for objects of class DVD
     * @param theTitle The title of this DVD.
     * @param theDirector The director of this DVD.
     * @param time The running time of the main feature.
     */
    public DVD(String theTitle, String theDirector, int time)
    {
        title = theTitle;
        director = theDirector;
        playingTime = time;
        gotIt = false;
        comment = "<no comment>";
    }

    /**
     * Enter a comment for this DVD.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @return The comment for this DVD.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this DVD.
     * @param ownIt true if we own the DVD, false otherwise.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * @return true if we own a copy of this DVD.
     */
    public boolean getOwn()
    {
        return gotIt;
    }

    /** 
     * @return the director
     */
    public String getDirector()
    {
        return director;
    }
    
    /** 
     * sets a new director
     * @dir the new director
     */
    public void setDirector(String dir)
    {
        director = dir;
    }
    
    /**
     * Print details about this DVD to the text terminal.
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
        System.out.println("    " + director);
        System.out.println("    " + comment);
    }
    
    /**
     * returns details about this Item .
     */
    public String toString()
    {
       String s = "";
       s = s+"Item: " + title + " (" + playingTime + " mins)";
       s = s + "\nDirector:  " + director ;
       if(gotIt) 
       {
          s = s + "*";
       }
       s = s + "\n    " + comment;
       return s;
    }
}
