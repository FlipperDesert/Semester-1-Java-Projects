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
        String name = JOptionPane.showInputDialog("Enter name: ");
        String target = JOptionPane.showInputDialog("How many times?");
        int nameCount = Integer.parseInt(target);
        int count = 0;

        while (count < nameCount)
        {
            System.out.println((count+1) + " " + name);
            count++;
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
