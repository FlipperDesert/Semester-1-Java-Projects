
/**
 * Stores and returns information about generic passes. 
 * @param passId is the user ID, name is the user name, rating and 
 * tokens store information for entering caverns
 *
 * @author (J Reece)
 * @version (16/12/19)
 */
public abstract class Pass
{
    private int passId;  
    private String name;
    private int rating;
    private int tokens;
    private static int nextId = 1000;
    
    /**
     * Creates the constructors for the Pass object
     * @param nam is the Pass name, rat is the rating and tkns
     * is the tokens
     */
    public Pass(String nam, int rat, int tkns)
    {
        name = nam;
        rating = rat;
        tokens = tkns;
        passId = ++nextId;
    }
    
    /**
     * Returns the name of the pass
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the Pass ID
     */
    public int getId()
    {
        return passId;
    }

    /**
     * Returns the rating of the pass
     */
    public int getRating()
    {
        return rating;
    }
    
    /**
     * Adds tokens to the pass
     * @param tkn is the number of tokens to add
     */
    public void addTokens(int tkn)
    {
        tokens = tokens + tkn;
    }
          
    /**
     * Returns the token value of the pass.
     */
    public int getTokens()
    {
        return tokens;
    }
    
    /**
     * Deducts tokens from the pass.
     * @param tkn is the number of tokens to deduct
     */
    public void deductTokens(int tkn)
    {
        tokens = tokens - tkn;
    }
    
    /**
     * Enters a cavern.
     */
    public abstract void enterCavern();
    
    /**
     * Checks if the pass has enough tokens to enter a cavern.
     */
    public abstract boolean hasTokens();
    
    /**
     * Returns a string of information on the pass.
     */
    public String toString() {
        String result = "Pass No: " + passId 
            + "\nName: " + name + "\nRating: " + rating 
            + "\nTokens: " + tokens;
        
        return result;
    }
    
}
