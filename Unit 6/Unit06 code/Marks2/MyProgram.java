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
        double[] marks = new double[10];
        double[] pass = new double[10];
        double average = 0;
       
        for (int i = 0; i < marks.length; i++) {
            String input = JOptionPane.showInputDialog(
            "Please enter a test score for student #" + (i+1));
            double student = Double.parseDouble(input);
            marks[i] = student;
        }
        
        for (int i = 0; i < marks.length; i++)
        {
            pass[i] = marks[i] / 80 * 100;
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
