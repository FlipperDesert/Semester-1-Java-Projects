
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    
    public Tester()
    {
        
        Person rando = new Person(4, "Joe Bloggs");
        Student duder = new Student(11482192, "Jimbo Jones", "Computer Science");
        Lecturer teach = new Lecturer(12345678, "Nicci Bicci", "Tooth Stuff", 69.420);
        
        // To String
        
        String s1 = rando.toString();
        String s2 = duder.toString();
        String s3 = teach.toString();
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        // Get Name
        
        String n1 = rando.getName();
        String n2 = duder.getName();
        String n3 = teach.getName();
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        
        // Is International
        
        duder.setInternational();
        System.out.println(duder.isInternational());
        
    }
    
    public static void main(String[] arguments) {
        
        Tester test = new Tester();
    }
    
}
