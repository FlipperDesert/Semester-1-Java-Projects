import java.util.*;
/**
 * Tests and prints inheritance methods on Pass objects.
 *
 * @author (J Reece)
 * @version (16/12/19)
 */
public class InheritanceTest
{
    ArrayList<Pass> passes = new ArrayList<Pass>();
    
    /**
     * Tests toString(), enterCavern(), getTokens(), getLoyalty()
     * and toToken()
     */
    public InheritanceTest()
    {
        passes.add(new Staff("Ratatouille", 1234, "Head Chef"));
        passes.add(new Business("Gordon Gecko", 4, 10, "Wall Street"));
        passes.add(new Gold("Helmut Kruger", 10));
        
        for (Pass currPass : passes) {
            // Make and print the toString() for each Pass
            String info = currPass.toString();
            System.out.println(info);
            
            //Deduct and print the token value for each Pass
            currPass.enterCavern();
            int tokens = currPass.getTokens();
            System.out.println("Token value for this pass after enterCavern(): " + tokens + "\n");
            
            // Shows the loyalty points for gold passes and
            // converts them to tokens, then prints the result
            if (currPass instanceof Gold) {
                int loyalty = ((Gold)currPass).getLoyalty();
                System.out.println("Current loyalty points for this pass: " + loyalty);
                
                while (((Gold)currPass).loyalty >= 5) {
                    ((Gold)currPass).toToken();
                }
                
                loyalty = ((Gold)currPass).getLoyalty();
                System.out.println("Loyalty points after deduction: " + loyalty + "\n");
            }
        }
    }
    
    public static void main(String[] arguments) {
        InheritanceTest test = new InheritanceTest();
    }
}
