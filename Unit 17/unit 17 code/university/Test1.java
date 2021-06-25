
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
        
        Person p = new Person (19, "Donald Trump");
        Person l = new Lecturer (21, "Bob Wilkinson", "Computer Science", 35000);
        Person s = new Student (23, "Amit Shah", "MCS1");
        
        System.out.println (p.toString());
        System.out.println (l.toString());
        System.out.println (s.toString());
    }
        
}
