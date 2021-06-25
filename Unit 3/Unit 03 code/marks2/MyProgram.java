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
       String input = JOptionPane.showInputDialog("Enter mark" );
       int metres = Integer.parseInt(input);
       int cents = metres * 100;
       
       System.out.println(metres + " metres is " + cents + " centimetres.");
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
