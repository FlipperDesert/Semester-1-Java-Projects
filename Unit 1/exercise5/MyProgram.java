
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
        double farenheit = 50;
        double centigrade = ((farenheit - 32) * 5) / 9;
        
        System.out.println(farenheit + " degrees farenheit is " + 
        centigrade + " degrees centigrade.");
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
