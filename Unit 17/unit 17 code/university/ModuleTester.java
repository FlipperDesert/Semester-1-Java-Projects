
/**
 * Write a description of class ModuleTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ModuleTester
{
    
    /**
     * Constructor for objects of class ModuleTester
     */
    public ModuleTester()
    {
        Person p = new Person (19, "Donald Trump");
        Person l = new Lecturer (21, "Bob Wilkinson", "Computer Science", 35000);
        Person s = new Student (23, "Amit Shah", "MCS1");
        ((Student)s).setInternational();
        
        Module compSci = new Module("Computer Science", 708010);
        
        compSci.addPerson(p);
        compSci.addPerson(l);
        compSci.addPerson(s);
        
        String nameList = compSci.getNames();
        String stringTest = compSci.toString();
        String intTest = compSci.getInternational();
        
        System.out.println(nameList + "\n\n\n" + stringTest + "\n\n\n" + 
        intTest);
    }
    
    public static void main(String[] arguments)
    {
        ModuleTester test = new ModuleTester();
    }
}
