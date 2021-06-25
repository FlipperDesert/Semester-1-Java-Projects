
/**
 * Creates a Staff pass object.
 * @param nam is the pass name, num is the employee number, title 
 * is the job title. The rating and tokens for each staff pass are 
 * 10 and 5.
 *
 * @author (J Reece)
 * @version (16/12/19)
 */
public class Staff extends Pass
{
    private int empNo;
    private String jobTitle;

    /**
     * The constructors for the Staff Pass. nam is name num is the 
     * employee number, title is the job title.
     */
    public Staff(String nam, int num, String title)
    {
        super(nam, 10, 5);
        empNo = num;
        jobTitle = title;
    }
    
    /**
     * Enters a cavern and deducts one token
     */
    public void enterCavern()
    {
        if (hasTokens()) {
            deductTokens(1);
        }
    }
    
    /**
     * Checks if the pass has enough tokens to enter a cavern. 
     */
    public boolean hasTokens() {
        return getTokens() >= 1; 
    }
    
    /**
     * Returns the employee number
     */
    public int getEmpNo() {
        return empNo;
    }
    
    /**
     * Returns the job title
     */
    public String getJob() {
        return jobTitle;
    }
    
    /**
     * Returns a string of information on the pass
     */
    public String toString()
    {
        String result = "***Staff Pass ***\n" + super.toString() + 
        "\nEmployee #: " + empNo + "\nJob Title: " + jobTitle + "\n"; 
        return result;
    } 
   
}
