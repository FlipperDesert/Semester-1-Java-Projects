
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
        int current = 18;
        
        if (current < max)
        {
            System.out.println("Heating on");
        }
        else if (current == max)
        {
            System.out.println("Set temperature reached - heating off");
        }
        else if (current > max)
        {
            System.out.println("Possible fault with system - Please check");
        }               
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
