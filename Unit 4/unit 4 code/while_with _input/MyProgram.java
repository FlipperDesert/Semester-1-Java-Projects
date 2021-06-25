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
        String targetAsText = JOptionPane.showInputDialog("How many times?" );
	    int target = Integer.parseInt(targetAsText);


        while (count < target)
        {
            System.out.println((count+1) + " Hello World!");
            count = count + 1;
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
