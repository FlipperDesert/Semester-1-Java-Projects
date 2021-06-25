
/**
 * Creates a Business pass object 
 * @param comp is the company name, name is the pass name, rat is 
 * the pass rating, tkns is the token value
 * 
 * @author (J Reece) 
 * @version (16/12/19)
 */
public class Business extends Pass
{
    private String company;

    /**
     * The constructors for the Business Pass
     * @param nam is the name, rat is the rating, tkns is the 
     * token value and comp is the company name
     */
    public Business(String nam, int rat, int tkns, String comp)
    {
        super(nam, rat, tkns);
        company = comp;
    }
    
    /**
     * Enters a cavern and deducts 4 tokens
     */
    public void enterCavern()
    {
        if (hasTokens()) {
            deductTokens(4);
        }
    }
    
    /**
     * Checks if the pass has enough tokens to enter a cavern
     */
    public boolean hasTokens() {
        return getTokens() >=4; 
    }
    
    /**
     * Returns the company name
     */
    public String getCompany() {
        return company;
    }
    
    /**
     * Returns a string of information on the pass
     */
    public String toString()
    {
        String result = "***Business Pass ***\n" + super.toString() + 
        "\nCompany: " + company + "\n"; 
        return result;
    } 
   
}
