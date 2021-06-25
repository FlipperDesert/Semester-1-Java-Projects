/**
 * The CD class represents a CD object. Information about the 
 * CD is stored and can be retrieved.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2006.03.30 amended by A.A.Marczyk 2007.12.01
 */
public class CD
{
    private String title;
    private String artist;
    private int numberOfTracks;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    /**
     * Initialize the CD.
     * @param theTitle The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks The number of tracks on the CD.
     * @param time The playing time of the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        title = theTitle;
        artist = theArtist;
        numberOfTracks = tracks;
        playingTime = time;
        gotIt = false;
        comment = "<no comment>";
    }

    /**
     * Enter a comment for this CD.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @return The comment for this CD.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this CD.
     * @param ownIt true if we own the CD, false otherwise.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * @return true if we own a copy of this CD.
     */
    public boolean getOwn()
    {
        return gotIt;
    }

    /** 
     * @return the artist
     */
    public String getArtist()
    {
        return artist;
    }
    
    /** 
     * sets a new artist
     * @dir the new artist
     */
    public void setArtist(String dir)
    {
        artist = dir;
    }
    
    /** 
     * @return the number of tracks
     */
    public int getTracks()
    {
        return numberOfTracks;
    }
    
    /** 
     * sets number of tracks
     * @trks number of tracks
     */
    public void setTracks(int trks)
    {
        numberOfTracks = trks;
    }
    
    
    /**
     * Print details about this CD to the text terminal.
     */
    public void print()
    {
        System.out.print("CD: " + title + " (" + playingTime + " mins)");
        if(gotIt) 
        {
            System.out.println("*");
        }
        else 
        {
            System.out.println();
        }
        System.out.println("    " + artist);
        System.out.println("    tracks: " + numberOfTracks);
        System.out.println("    " + comment);
    }
    
    /**
     * returns details about this Item .
     */
    public String toString()
    {
       String s = "";
       s = s+"Item: " + title + " (" + playingTime + " mins)";
       s = s + "\nArtist:  " + artist + "    Tracks: " + numberOfTracks;
       if(gotIt) 
       {
          s = s + "*";
       }
       s = s + "\n    " + comment;
       return s;
    }
}
