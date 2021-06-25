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
        String input = JOptionPane.showInputDialog("Enter Number: ");
        int target = Integer.parseInt(input);
        int count = 0;

        while (count < target)
        {
            if (count % 10 == 0) {
                System.out.println(count);
            }
            count++;
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
