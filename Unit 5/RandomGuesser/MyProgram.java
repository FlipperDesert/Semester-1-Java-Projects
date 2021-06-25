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
        int score = 0;
        
        while (true) {
            int rando1 = new java.util.Random().nextInt(100);
            int rando2 = new java.util.Random().nextInt(100);
            
            String guess = JOptionPane.showInputDialog("Number 1 is " + rando1 + 
            ". Is number 2 higher than number 1?");
            System.out.println(guess);
            
            if (guess.equalsIgnoreCase("yes")) {
                if (rando1 < rando2) {
                    score += 10;
                } else {
                    score -= 10;
                }
            } else if (guess.equalsIgnoreCase("no")) {
                 if (rando1 > rando2) {
                    score += 10;
                } else {
                    score -= 10;
                }
            }
            
            String cont = JOptionPane.showInputDialog("Number 2 is " + rando2 + 
            " and your score is " + score + ". Continue?");
            System.out.println(cont);
                
            if (cont.equalsIgnoreCase("no")) {
                break;
            }
        }
        
        System.out.println("You end the game with a score of " + 
        score + "!");
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
