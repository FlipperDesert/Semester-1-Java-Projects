
/**
 * Write a description of class Example here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Digger extends Tool 
{
    private boolean hired;
    private String hiredTo ;
    private boolean training;
    
    public Digger(int ref, String nme)
    {
        super(ref,nme);
        hired = false;
        hiredTo = "";
        needsTraining();
    }
    
    public void hire(String person)
    {
        hired = true;
        hiredTo = person;
    }
    
    public void bringBack()
    {
        hired = false;
        hiredTo = "";
    }
    
    public void needsTraining()
    {
        training = true;
    }
}
