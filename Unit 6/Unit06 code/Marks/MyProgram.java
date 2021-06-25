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
        double[] marks = {65, 57, 73, 36, 42, 52, 67, 30, 55, 48};
        double[] pass = new double[10];
        double average = 0;
        
        for (int i = 0; i < marks.length; i++)
        {
            pass[i] = marks[i] / 80 * 100;
            System.out.println(pass[i]);
        }
        System.out.print("The passing scores are: ");
        for (int i = 0; i < pass.length; i++) {
            if (pass[i] > 40) {
                System.out.println(pass[i] + "\n");
            }
        }
        
        for (int i = 0; i< pass.length; i++) {
            average = average + marks[i];
        }
        System.out.println("The average score is: " + 
        (average / marks.length));
        
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
