
/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
    public void runMyProgram()
    {
        //Write your code here
        int x = 16;
        int y = 5;
        int z = 3;
        
        int answerA = x + y * z;
        // x plus y times z
        int answerB = x / y;
        // x divided by y - rounded to nearest int
        int answerC = x % y;
        // the remainder of x divided by y (modulo)
        int answerD = x + z % y;
        // x plus z modulo y
        int answerE = (x + z) % y;
        // x plus z, then modulo y
        int answerF = x + (z % y);
        // x plus the result of z modulo y
        
        System.out.println(answerA);
        System.out.println(answerB);
        System.out.println(answerC);
        System.out.println(answerD);
        System.out.println(answerE);
        System.out.println(answerF);
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
