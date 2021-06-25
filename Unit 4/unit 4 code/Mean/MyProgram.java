
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
        int count = 0;
        int result = 0;

        while (count < 10)
        {
            String input = JOptionPane.showInputDialog("Enter a number: ");
            int number = Integer.parseInt(input);
            System.out.println(number);
            result += number;
            count++;
        }
        
        int mean = result / 10;
        System.out.println("The mean of your numbers is " + mean);
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
