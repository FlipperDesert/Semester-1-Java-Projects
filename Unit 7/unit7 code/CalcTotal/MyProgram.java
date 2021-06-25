import javax.swing.JOptionPane;

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
        
        double calc1 = calcTotal(1.25, 6);
        System.out.println(calc1);
        
        double calc2 = calcTotal(2.00, 5);
        System.out.println(calc2);
        
    }
        
    /* this is a method (function) that converts a Celsius value
     * to a Fahrenheit value.  It takes an int and returns a double
     * This is a method DEFINITION
     */
    public double calcTotal (double price, int quantity)
    {
        double total = (price * 1.2) * quantity;
        return total;
    }
        

        

    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
