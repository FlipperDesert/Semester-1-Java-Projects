
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name; 
    private int idNumber;
    
    public Person(int number, String aName)
    {
        name = aName;
        idNumber = number;
    }

    public String getName() {
        return name;
    }
    
    public int getIdNumber() {
        return idNumber;
    }
    
    public String toString() {
       String s = "Name: " + name + "\nNumber: " + idNumber;
       
       return s;
    }
}
