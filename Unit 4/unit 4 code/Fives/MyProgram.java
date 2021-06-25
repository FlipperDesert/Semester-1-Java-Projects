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
        String times = JOptionPane.showInputDialog("How many fives?");
        
        int count = 0;
        int target = Integer.parseInt(times);

        while (count < target)
        {
            System.out.println((count+1) * 5);
            count++;
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
