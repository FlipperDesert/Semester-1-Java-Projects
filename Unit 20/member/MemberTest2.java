/** uses public static fields in Member
 * 
 */
public class MemberTest2
{   
    // Note how public static final fields in Member are used
    private Member q1 = new Member("John",30, 40, Member.STUDENT);      //no need to remember the code
    private Member q2 = new Member("Fred",100,50, Member.ADMINISTRATOR);
    private Member q3 = new Member("Mary",100,60, Member.TEACHER);

    
    // It is still possible to use int
    private Member q4 = new Member("Anil",150,100,3); // Anil is a teacher, but you have to remember the code
    // However, it is possible to do illegal things
    private Member q5 = new Member("Olek",20,200, 7);   // what is Olek ??
    private Member q6 = new Member("Borys",20,200, -5); // what is Borys - see printouts below
    
    
    
    public void runTest()  // make this static and see the effect
    {
        System.out.println("Testing Member class");
        System.out.println("and static fields ");
        
        System.out.println("q1\n" + q1.getDetails());
        System.out.println("q2\n" + q2.getDetails());
        System.out.println("q3\n" + q3.getDetails());
        System.out.println("q4\n" + q4.getDetails());
        System.out.println("q5\n" + q5.getDetails());   
        System.out.println("q6\n" + q6.getDetails()); 
        
        // can use public static fields to check for equality
        if (q2.getType() == Member.STUDENT)
        {
            System.out.println("\n" + q2.getName() + " is a student ");
        }
        else
        {
            System.out.println("\n" + q2.getName() + " is NOT a student ");
        }
    }
}


