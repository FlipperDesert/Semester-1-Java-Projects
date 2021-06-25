import java.util.HashMap;
/**
 * Write a description of class AEUsersMap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AEUsersMap
{
    private HashMap<Integer,Patient> waiting = new HashMap<Integer,Patient>();
    
    
    /** 
     * Adds a Patient object to the array
     * @param p is the reference to the Patient object
     */
    public void addPatient(Patient p)
    {
        int pos = 0;
        
        if (waiting.get(pos) != null) {
            pos++;
        } else {
            waiting.put(pos, p);
        }
    }
    
    /** 
     * Adds a Patient object to the array
     * @param pN is the patient's number
     * @param nme is the patient's name
     * @param gp is the patient's GP
     * @param d - day of patient's birth
     * @param m - month of patients' birth
     * @param y - year of patient's birth
     */
    public void addPatient(int pN, String nme, String gp, int d,int m, int y)
    {
        
        Patient xx = new Patient(pN,nme,gp,d,m,y);
        waiting.put(xx.getPatientNo(), xx);
    }
    
    
    /** 
     * Adds a Patient object to the array at the specified position
     * @param pos it the position 
     * @param pp is the reference to the Patient object
     */
    public void addPatient(int pos, Patient pp)
    {
        waiting.put(pos, pp);
    }
    
    
    public void removePatient(int pNo)
    {
        waiting.remove(pNo);
    }
    
    /** Returns the position in the array of the patient with the 
     *  specified patient number
     *  @param PNo is the patient's number
     *  @return the position of the patient in the array, 
     *  or -1 if not found
     */
    public Patient findPatientbyPNo(int pNo)
    {/*
        for (int i = 0; i < waiting.size(); i++) {
            Patient temp = .get(i);
            if (temp.getPatientNo() == no) {
                
                return temp;
            }
        }*/
        return waiting.get(pNo);
        
       // return null;
    }
    
            
    public Patient getPatient(int pNoh)
    {
        if (pos < waiting.size()) {
            return waiting.get(pos);
        }
        return null;
    }
    
    public Patient getPatientbyPNo(int pno)
    {
        for (int i = 0; i < waiting.size(); i++) {
            Patient temp = waiting.get(i);
            
            if (pno == temp.getPatientNo()) {
                return temp;
            }
        }
        
        return null;
    }
    
    public void updatePatient(int pno, int hours) {
        for (int i = 0; i < waiting.size(); i++) {
            Patient temp = waiting.get(i);
            
            if (pno == temp.getPatientNo()) {
                temp.updateWaitingTime(hours);
            }
        }
    }
    
    public void updateALL(int hours) {
        for (int i = 0; i < waiting.size(); i++) {
            Patient temp = waiting.get(i);
            temp.updateWaitingTime(hours);
        }
    }
    
    public void print()
    {
        for (int i = 0; i < waiting.size(); i++)
        {
            Patient temp = waiting.get(i);
            System.out.println(temp.toString());
        }
    }
    
    public String toString()
    {
        
        String ss = "\n";
        for (int i = 0; i < waiting.size(); i++)
        {
            Patient temp = waiting.get(i);
            ss = ss + temp + "\n";
        }
        
        return ss;
    }
}
