
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
        int max = 20;
        int current = 25;
        
        if (current < max)
        {
            System.out.println("Heating on");
        }
        else 
        {
            System.out.println("House is warm: heating switches off");
        }               
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
