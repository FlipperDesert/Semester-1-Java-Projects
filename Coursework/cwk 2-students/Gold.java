
/**
 * Creates a Gold pass object
 * @author (J Reece)
 * @version (a version number or a date)
 */
public class Gold extends Pass
{
    int loyalty;
    
    /**
     * The constructors for the Gold Pass
     * @param loyalty is the loyalty points value for the pass and 
     * always starts at 10. nam is the pass name, rat is 
     * the pass rating and the token value starts at 30
     */
    public Gold(String nam, int rat)
    {
        super(nam, rat, 30);
        loyalty = 10;
    }
    
    /**
     * Adds loyalty points to the pass
     * @param points is the number of loyalty points to add
     */
    public void addLoyalty(int points) {
        loyalty = loyalty + points;
    }
    
    /**
     * Returns the loyalty points total
     */
    public int getLoyalty() {
        return loyalty;
    }
    
    /**
     * Converts 5 loyalty points to 1 token
     */
    public void toToken() {
        if (loyalty >= 5 ) {
            loyalty = loyalty - 5;
            addTokens(1);
        }
    }
    
    /**
     * Enters a cavern, deducts 3 tokens and adds 2 loyalty points
     */
    public void enterCavern()
    {
        if (hasTokens()) {
            deductTokens(3);
            addLoyalty(2);
        }
    }
    
    /**
     * Checks if the pass has enough tokens to enter a cavern.
     */
    public boolean hasTokens() {
        return getTokens() >= 3; 
    }
    
    /**
     * Returns a string of information on the pass.
     */
    public String toString()
    {
        String result = "***Gold Pass ***\n" + super.toString() + 
        "\nLoyalty: " + loyalty + "\n"; 
        return result;
    } 
}
