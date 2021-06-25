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
        int circle1 = 10;
        int circle2 = 12;
        int ring1 = 6;
        int ring2 = 5;
        
        double area1 = circleArea(circle1);
        printResult(area1);
        
        double area2 = circleArea(circle2);
        printResult(area2);
        
        double ring = circleArea(ring1);
        double hole = circleArea(ring2);
        double result = ring - hole;
        printResult(result);
    }
        
    /* this is a method (function) that converts a Celsius value
     * to a Fahrenheit value.  It takes an int and returns a double
     * This is a method DEFINITION
     */
    public double circleArea(double radius)
    {
        double area = Math.PI * (radius * radius);
        return area;
    }
        
    public void printResult(double radResult)
    {
        System.out.println("The area of this circle is: "+radResult);
    }
        

    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
