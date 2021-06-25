
/**
 * Write a description of class Lecturer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lecturer extends Person
{
    private String department;
    private double salary;

    public Lecturer (int idNumber,String name,String department,double salary)
    {
        super (idNumber, name);
        this.department = department;
        this.salary = salary;
    }
    
    public String toString()
    {
        return personToString() + "  " + department + "  " + salary;
    }
}
