

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
        int min = 18;
        int max = 65;
        int age = 900;
        
        if (age >= min && age <= 65) {
            System.out.println("You are eligible for jury duty!");
        } else {
            System.out.println("You are not within the age range for jury duty!");
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
