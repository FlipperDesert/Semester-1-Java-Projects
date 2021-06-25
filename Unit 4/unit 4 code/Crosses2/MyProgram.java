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
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                
                if (j > i) {
                    System.out.print("\tX");
                } else { 
                    System.out.print("\t");
                }
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
