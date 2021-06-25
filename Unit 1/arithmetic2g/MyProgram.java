
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
        int first = 15;
        int second = 4;
        // since ints do not track decimal places,
        //it has rounded down to a whole number
        
        int answer = first / second;
        System.out.println(answer);
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
