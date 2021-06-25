
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
        int days = 24;
        int weeks = days / 7;
        int point = days % 7;
        
        if ( point > 0) {
            System.out.println(days + " days is " + weeks + 
        " weeks and " + point + " days.");
        } else {
            System.out.println(days + " days is " + weeks + 
        " weeks.");
        }
        
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
