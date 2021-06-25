
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{    
    /**
     * Constructor for objects of class Tester
     */
    public static void main(String[] args)
    {       
        Square test = new Square(4);
        
        System.out.println("This square is " + test.getLength() + 
        ", " + test.getWidth() + " with an area of " + test.getArea());
    }

    
}
