
/**
 * Write a description of class Tool here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Tool implements Hireable
{
    int reference;
    String type;
    
    public Tool(int ref, String nme)
    {
        reference = ref;
        type = nme;
    }
    
    public void hire()
    {
        // nothing here 
    }
    
    // Why is there no need for bringBack ???
    
    abstract void needsTraining();
    
    
    
    
}
