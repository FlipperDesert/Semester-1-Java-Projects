
/**
 * Write a description of class AudioBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AudioBook extends Item
{
    private String author;
    private String reader;
    /**
     * Constructor for objects of class AudioBook
     */
    public AudioBook(String theTitle, int time, String auth, String rdr)
    {
        super(theTitle, time);  // call  to parent constructor
        author = auth;
        reader = rdr;
    }
    
    public String getMaker()
    {
        return author;
    }

       
    }

   
