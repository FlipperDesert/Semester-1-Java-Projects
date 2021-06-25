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
        String pal = "hannah";
        char[] backwards = new char[pal.length()];
        int charCount = pal.length();
        
        for (int i = 0; i < pal.length(); i++) {
            backwards[i] = pal.charAt(charCount-1);
            charCount--;
        }
        
        System.out.println(backwards);
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
