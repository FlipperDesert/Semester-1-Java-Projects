
/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;

public class MyProgram
{
    public void runMyProgram()
    {
        //Write your code here
        int max = 20;
        int min = 15;
        String input = JOptionPane.showInputDialog("Enter Temperature");
        int current = Integer.parseInt(input);
        
        
        if (current <= min)
        {
            System.out.println("Your house is too cold - Heating on");
        }
        else if (current > min && current < max) {
            System.out.println("Comfortable temperature");
        }
        else if (current == max)
        {
            System.out.println("Set temperature reached - Heating off");
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
