
/**
 * A Note is a class for storing text with a heading.
 * It uses an API (library) class StringBuilder
 * @author Ian Bradford
 * @version 1.00
 */
public class Note
{
    private String heading;
    private StringBuilder content;

    /**
     * Create a note with a supplied heading
     * @param - the heading of the note
     */
    public Note(String heading)
    {
        this (heading, "");
    }
    
    public Note (String hding, String text)
    {    
        heading = hding;
        content = new StringBuilder(text);
    }

    /**
     * Add content to the note (append).  If there is no text in the note
     * then this text is first content.  If there is already text the this is 
     * appended
     * 
     * @param  text - the content you wish to add
     * 
     */
    public void append(String text)
    {
        content.append(text);
    }
    public String getHeading(){
        return heading;
    }
    public String getContent(){
        return content.toString();
    }
    public String toString(){
        return heading + ": "+ content.toString();
    }
}
