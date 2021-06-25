
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
        int target = 18;
        int age = 21;
        
        if (age >= target) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not old enough to vote!");
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
