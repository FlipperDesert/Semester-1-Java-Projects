
/**
 * class StudentTest tests the Student class by creating some
 * Student objects and calling their methods.
 * StudentTest is a client of Student
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentTest
{
    private Student stud1 ;                              // declare
    private Student stud2 = new Student(2345, "Anne");   // Alternative: declare & create 
    private Student stud3 = new Student(3456, "Jo");     // Alternative: declare & create
    
    // NO constructor needed
    
    public void doTest()
    {
        stud1 = new Student(1234, "Mary");     //create
        stud1.setFees(9000);
        stud1.addCredits(30);
        System.out.println("Credits of stud1:" + stud1.getCredits());
        
        stud2.setFees(9000);
        stud3.setFees(7250);
        stud3.addCredits(15);
        System.out.println("Credits of stud2:" + stud2.getCredits());
        System.out.println("Credits of stud3:" + stud3.getCredits());
        stud2.payFees(3000);
        System.out.println("Outstanding fees of stud1:" + stud1.getFeesOutstanding());
        System.out.println("Outstanding fees of stud2:" + stud2.getFeesOutstanding());
        System.out.println("Outstanding fees of stud3:" + stud3.getFeesOutstanding());
        System.out.println(stud1.toString());
        System.out.println(stud2.toString());
        System.out.println(stud3.toString());
    }
}
