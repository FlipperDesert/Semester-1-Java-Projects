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
       String num1 = JOptionPane.showInputDialog("Enter number 1");
       String num2 = JOptionPane.showInputDialog("Enter number 2");
       int int1 = Integer.parseInt(num1);
       int int2 = Integer.parseInt(num2);
       int sum = int1 + int2;
       
       System.out.println(int1 + " plus " + int2 + " equals " + sum);
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
