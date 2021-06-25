
/**
 * Write a description of class MemberTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MemberTest
{ 
    // Note how public static final fields in Member are used
    private Member q1 = new Member("John",30, 40, 1);      //no need to remember the code
    private Member q2 = new Member("Fred",100,50, 2);
    private Member q3 = new Member("Mary",100,60, 3);
    //private Member q3 = new Member("Anne",80,60, 3);
    
    public void runTest()  // make this static and see the effect
    {
        System.out.println("Testing Member class");
        System.out.println("and static fields ");
        
        System.out.println("q1\n" + q1.getDetails());
        System.out.println("q2\n" + q2.getDetails());
        System.out.println("q3\n" + q3.getDetails());
        //System.out.println("q4\n" + q4.getDetails());
        
        System.out.println("q1 Fee " + q1.getFee());
        
        System.out.println("q1 Reg " + q1.getReg());
        System.out.println("q1 Next id " + q1.getNextId());  
        System.out.println("q1 Next id " + Member.getNextIdNo());   // calling static method
    }
}
