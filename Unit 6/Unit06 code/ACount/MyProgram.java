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
        
        String message = "The cat sat on the mat";
        
        int counter = aCount(message);
        
        System.out.println("Your messages contains the letter A "
        + counter + " times.");
    }
    
    public int aCount(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                counter++;
            }
        }
        return counter;
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
