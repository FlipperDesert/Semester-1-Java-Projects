
/**
 * Simple student with a name and id number. Student also has credits band fees to pay
 * 
 * @author A.A.Marczyk
 * @version 18/11/2010 version 1
 */
public class Student
{
    private String name;
    private int idNo;
    private int credits;
    private double fees;
    private double feesPaid;
   
    public Student(int id, String n)
    {
       name = n;
       idNo = id;
       credits = 0;
       fees = 0;
       feesPaid = 0;
    }
   
	public int getStudentNo()
	{
	    return idNo;
	}	
	
	public String getName()
	{
	    return name;
	}
	
	public int getCredits()
	{
	    return credits;
	}
	
	public boolean hasPaid()
	{
	    return fees == feesPaid;
	}
	
	public double getFeesOutstanding()
	{
	    return fees - feesPaid;
	}
	
	public void setFees(double f)
	{
	    fees = f;
	}
	
	public void addCredits(int creds)
	{
	   credits = credits + creds;
	}
	
	
	public void payFees(double p)
	{
	    feesPaid = feesPaid + p;
	}
	
	
	
	public String toString()
	{
	    String s = "\nStudent Name: " + name + "   Student No: " + idNo + "\nCredits :" + credits;
	    s = s + "\nFees: £" + fees + "  Fees paid: £" + feesPaid;
	    return s;
	}
	
	
}
