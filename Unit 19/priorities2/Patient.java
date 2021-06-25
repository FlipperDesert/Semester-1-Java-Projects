
/**
 * Used to store information about a patient Including patient no., name, GP name
 * date of birth, time arrived and the time treatment was started
 * Added in this version an urgency field
 * 
 * @author A.A.Marczyk 
 * @version 24/11/14
 */
public class Patient implements Prioritisable
{
    private int patientNo;
    private String name;
    private String gpName;
    private int urgency;
    
    /** Creates a patient
     * @param pNo represents the patient's number
     * @param n represents the name
     * @param gp represents the GP's (family doctor's) name
     */
    public Patient(int pNo, String n, String gp, int urg)
    {
        patientNo = pNo;
        name = n;
        gpName = gp;
        urgency = urg;
    }
    
    public int getPriority()
    {
        return urgency;
    }
    
    
    /** Returns the patient's number
     * @return patient number
     */
    public int getPatientNo()
    {
        return patientNo;
    }
    
    /** Returns the patient's name
     * @return name
     */
    public String getName()
    {
        return name;
    }
    
    /** Returns the patient's GP's name
     * @return GP name
     */
    public String getGPName()
    {
        return gpName;
    }
    
    
    /** Returns a String representation of the patient information
     *  @return the patient information as a String
     */
    public String toString()
    {
        String s;
        s = "Patient No: " + patientNo + "  " + name + "\nGP name : " + gpName 
            + "\n*********Urgency : " + urgency;
        return s;
    }
}
