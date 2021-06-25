/**
 * The CD class represents a CD object. Information about the 
 * CD is stored and can be retrieved.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2006.03.30 amended by A.A.Marczyk 2007.12.01
 */
public class CD extends Item
{
    private String artist;
    private int numberOfTracks;

    /**
     * Initialize the CD.
     * @param theTitle The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks The number of tracks on the CD.
     * @param time The playing time of the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
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
        super.print();
        System.out.println("    " + artist);
        System.out.println("    tracks: " + numberOfTracks);
    }
    
    /**
     * returns details about this Item .
     */
    public String toString()
    {
       String s = "";
       s = super.toString();
       s = s + "\nArtist:  " + artist + "    Tracks: " + numberOfTracks;
       return s;
    }
}
