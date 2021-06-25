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
        char [] name = new char[5];
        char [] surname = new char[5];
        name[0] = 'J';
        name[1] ='a';
        name[2] ='m';
        name[3] = 'e';
        name[4] = 's';
        surname[0] = 'R';
        surname[1] = 'e';
        surname[2] = 'e';
        surname[3] = 'c';
        surname[4] = 'e';
        
        
        for (int i = 0; i <name.length; i++)
        {
            System.out.print(name[i]); // NOTE: the use of print rather than println
        }
        System.out.print(" ");
        for (int i = 0; i < surname.length; i++) {
            System.out.print(surname[i]);
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
