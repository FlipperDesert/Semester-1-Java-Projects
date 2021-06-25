
/**
 * Simple student with a name and id number. Student also has credits band fees to pay
 * 
 * @author A.A.Marczyk
 * @version 18/11/2014 version 1
 */
public class Student  //implements Prioritisable
{
    private String name;
    private int idNo;
    private int credits;
    private double fees;
    private double feesPaid;
   
    public Student(String n, int id)
    {
       name = n;
       idNo = id;
       credits = 0;
       fees = 0;
       feesPaid = 0;
    }
   
    public int getPriority()
    {
        return idNo;
    }
    
	public int getStudentNo()
	{
	    return idNo;
	}
	
	public void addCredits(int c)
	{
	   credits = credits + c;
	}
	
	public int getCredits()
	{
	    return credits;
	}
	
	public void setFees(double f)
	{
	    fees = f;
	}
	
	public void payFees(double p)
	{
	    feesPaid = feesPaid + p;
	}
	
	public boolean hasPaid()
	{
	    return fees == feesPaid;
	}
	
	public double getFeesOutstanding()
	{
	    return fees - feesPaid;
	}
	
	public String toString()
	{
	    String s = "Student Name: " + name + "   Student No: " + idNo + "\nCredits :" + credits;
	    s = s + "\nFees: £" + fees + "  Fees paid: £" + feesPaid;
	    return s;
	}
	
	
}
