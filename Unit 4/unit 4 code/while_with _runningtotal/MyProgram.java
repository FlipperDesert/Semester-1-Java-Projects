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
        //Can you change this so target depends on user input?
        int count = 0;
        int target = 5;
        int total = 0; 
        while (count < target)
        {
            String numberAsText = JOptionPane.showInputDialog("Enter number ?");
            int number = Integer.parseInt(numberAsText);
            total = total + number; //running total
            count = count + 1;
        }
        System.out.println("Total is = " + total);

    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
