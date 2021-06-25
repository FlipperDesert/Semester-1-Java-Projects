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
        // Write your code here
        System.out.println("Converter");
        String menu = "";
        while (!(menu.equalsIgnoreCase("Q"))) {
            menu = displayMenu();
            if (menu.equalsIgnoreCase("C")) {
                int c = getInputValue();
                double f = fahrenheitToCelsius(c);
                printResult("That turns into ", f);
            } else if (menu.equalsIgnoreCase("f")) {
                int f = getInputValue();
                double c = celsiusToFarenheit(f);
                printResult("That turns into ", c);
            }
            
        }
        System.out.println("Thank you for using the temperature converter");    
        
        
    }

    // These are method definitions

    /* This method(function) asks for user to input a number and
     * returns the value input
     * This is a typical "input" function
     */
    public int getInputValue()
    {
        String input = JOptionPane.showInputDialog("Enter value : ");
        int result = Integer.parseInt(input);
        return result;
    }

    
    /* This method (function) converts Farenheit to Centigrade
     * This is a typical "processing" function
     */
    double fahrenheitToCelsius(int fahrenheit)
    {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    
    /* This method (function) converts Centigrade to Farenheit
     * This is a typical "processing" function
     */
    double celsiusToFarenheit(int celsius)
    {
        double farenheit = celsius * 9 / 5 + 32;
        return farenheit;
    }
    

    
    /* This method (procedure) takes an int and displays it
     * for the user
     * This is a typical "output" procedure
     * @param mess is the message you want to send with this result
     * @param res is the result
     */
    public void printResult(String mess, double res)
    {
        System.out.println( mess + res);
    }
        
    /* This method is a common "output" procedure
     * It has no parameters
     */
    public String displayMenu()
    {
        String choice = JOptionPane.showInputDialog("Enter C - farenheit to Celsius, F - Celsius to Farenheit, Q - Quit");
        return choice;
    }

    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
