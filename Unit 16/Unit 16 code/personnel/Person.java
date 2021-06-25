
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    private int idNumber;                           
    private String name; 
    
    public Person(int id, String name)
    {
        idNumber = id;
        this.name = name;
    }
    
    /**
    * returns student id as an int
    * @return value returned is student id as an int
    */                                                       
    public int getIdNo ()                           
    {
        return idNumber;                           
    }   

    /**
    * returns student name as a String
    * @return value returned is student name as a String
    */ 
    public String getName ()
    {
        return name;                                
    }    
    
    public String personToString ()
    {
        String result = idNumber + "  " + name;
        return result;
    }
}
