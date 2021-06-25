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
        int numChoice = 0;
        System.out.println("Calculator");
           
        //calling the input function twice
        while (numChoice != 6) {
            printMenu();
            numChoice = choice();
            if (numChoice != 6) {
                int num1 = getNumber();
                
                //calling a processing function
                if (numChoice == 1) {
                    int num2 = getNumber();
                    int answer = add(num1, num2);
                    printResult(answer);
                } else if (numChoice == 2) {
                    int num2 = getNumber();
                    int answer = subtract(num1, num2);
                    printResult(answer);
                } else if (numChoice == 3) {
                    int num2 = getNumber();
                    int answer = multiply(num1, num2);
                    printResult(answer);
                } else if (numChoice == 4) {
                    int num2 = getNumber();
                    int answer = divide(num1, num2);
                    printResult(answer);
                } else if (numChoice == 5) {
                    double answer = sqrt(num1);
                    System.out.println("The Square root of "+
                    num1+" is "+answer);
                }
            }
        }
            
            System.out.println("Thank you");
    }

    // These are method definitions
    /* This method(function) asks for user to input a number and
     * returns the value input
     * This is a typical "input" fundtion
     */
    public int getNumber()
    {
        String numberAsText = JOptionPane.showInputDialog("Enter number" );
        int number = Integer.parseInt(numberAsText);
        return number;
    }
    
    public void printMenu()
    {
        System.out.println("Add\nSubtract\nMultiply\nDivide\nSquare Root");
    }
    
    public int choice()
    {
        String input = JOptionPane.showInputDialog(
        "1 for +, 2 for -, 3 for *, 4 for /, 5 for square root, 6 to quit");
        int decision = Integer.parseInt(input);
        return decision;
    }
    
    /* This method (function) adds two numbers
     * This is a typical "processing" function
     */
    public int add (int x, int y)
    {
        int z  =  x + y;
        return z;
    }
    
    public int subtract (int x, int y)
    {
        int z = x - y;
        return z;
    }
    
    public int multiply (int x, int y)
    {
        int z = x * y;
        return z;
    }
    
    public int divide (int x, int y)
    {
        int z = x / y;
        return z;
    }
    
    public double sqrt (int x)
    {
        double y = Math.sqrt(x);
        return y;
    }
    
    /* This method (procedure) takes an int and displays it
     * for the user
     * This is a typical "output" procedure
     */
    public void printResult(int res)
    {
        System.out.println("The result for your two numbers is: "+ res);
    }
        
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
