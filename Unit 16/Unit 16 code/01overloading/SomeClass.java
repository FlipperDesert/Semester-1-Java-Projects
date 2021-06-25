
/**
 * Write a description of class SomeClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SomeClass
{
    int var1;
    double var2;
    
    
    /**
     * Constructor for objects of class SomeClass
     */
    public SomeClass(int x)
    {
        var1 = x; 
        var2 = 0;
    }
    
    /**
     * Constructor for objects of class SomeClass
     */
    public SomeClass(int x, int y)
    {
        var1 = x; 
        var2 = y;
    }
    
    
    
    /**
     * Constructor for objects of class SomeClass
     */
    public SomeClass(double y)
    {
        var1 = 0;
        var2 = y; 
    }

    
    // overloaded methods
  
    public double sampleMethod(int w)
    {
        // put your code here
        return var2 * w;
    }   
    
   
    public double sampleMethod(double y)
    {
        // put your code here
        return var1 * y;
    }
    
    public double sampleMethod(double y, double z)
    {
        // put your code here
        return y * z;
    }
    
    
}
