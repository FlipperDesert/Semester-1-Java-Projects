public class Member
{
    // class fields 
    public static final double BASIC = 50; // can't change, could be public !!!!!
    private static int nextIdNumber = 100;  // can change but is private
        
    // object fields            
    private final double max = 200;  // can't be changed
    private final String name;      // can be set in constructor but then can't be changed
    private final double yearly;
    private int reg;
    private double fee;
    private double feePaid;
    
    // enumerated fields : Strings handled as ints
    public static final int STUDENT = 1;
    public static final int ADMINISTRATOR = 2;
    public static final int TEACHER = 3;
    private int type;

    public Member (String nme, double fpaid, double yrl, int typ)           
    {  
        name = nme;  // will compile in constructor
        //max = 120;  //  won't compile
        yearly = yrl; // unchangeable once set here
        fee = BASIC + yearly;
        feePaid = fpaid;
        type = typ;
        // set the member's id
        reg = nextIdNumber;
        // increment everytime a Member object is created
        nextIdNumber++;   
    }
    
    public String getName()     
    {   
        return name;
    }
    
    public void changeName(String ss)
    {        
        //name = ss;  // won't compile
    }
           
    public double getFee()     
    {   
        return fee;
    }
    
    public  int getReg()     
    {   
      return reg;
    }
    
    // could be static or non-static
    public static int getNextIdNo()
    {
        return nextIdNumber;
    }   
      
    // non-static equivalent of getNextIdNumber 
    // - see difference in usage in MemberTest
    public int getNextId()
    {
        return nextIdNumber;
    }  
    
    // need this because otherwise type would just be a number 1 - 3
    public String getTypeAsString()
    {
        if (type == STUDENT)
        {   return " Student"; }
        else if (type == TEACHER)
        {   return " Teacher"; }
        else if (type == ADMINISTRATOR)
        {   return " Administrator"; }
        return "Unknown";
    }
    
    // Note that the return value is a number not a String
    public int getType()
    {
        return type;
    }
    
    public String getDetails()
    {
        String s = reg + "  " + name + " paid: £" + feePaid;
        if (hasPaidInFull())
        {
            s = s + "\nPaid in Full";
        }
        else
        {
             s = s + "\nFees still outstanding = £" + (fee - feePaid);
        }
        s = s + "\nType: " + getTypeAsString();
        return s;
    }
    
    public boolean hasPaidInFull()
    {
        return feePaid >= fee; 
    }
    
} 
