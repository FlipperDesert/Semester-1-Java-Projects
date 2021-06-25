import java.util.*;
/**
 * Write a description of class Test1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test1
{
 
    public static void main(String[] args)
    {
        
        Person per = new Person (19, "Donald Rumsfeld");
        Lecturer lec = new Lecturer (21, "Bob Wilkinson", "Computer Science", 35000);
        Student std = new Student (23, "Amit Shah", "MCS1");
        ArrayList<Person> personnel = new ArrayList<Person>();
        
        System.out.println (per.personToString());
        System.out.println (lec.toString());
        System.out.println (std.toString());
        
        // What happens here ? why?
        System.out.println ("Using toString() on Person\n" + per.toString());
        
        System.out.println("\nUsing an ArrayList");
        personnel.add(per);
        personnel.add(lec);
        personnel.add(std);
        
        // What happens here ? why?
        for(Person xxx : personnel)
        {
            System.out.println (xxx.personToString());
        }
    }
        
}
