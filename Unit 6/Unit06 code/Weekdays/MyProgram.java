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
        // Note: there are better ways to do this in Java
        String [] weekdays = {"Monday", "Tuesday", "Wednesday", 
            "Thursday", "Friday", "Saturday", "Sunday"};
            
        for (int i = 0; i < weekdays.length; i++) {
            System.out.println(weekdays[i]);
        }
        
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
