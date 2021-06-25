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
        boolean[] test = new boolean[5];
        int[] nums = {5, 20, 17, 3, 8};
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 10) {
                test[i] = true;
            } else {
                test[i] = false;
            }
        }
        
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
