
/**
 * Write a description of class StringTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringTester
{
    public static void main(String[] args)
    {
        Circle round1 = new Circle(7);
        ColouredCircle round2 = new ColouredCircle(java.awt.Color.RED, 5);
        // Compile even though no toString() method in either Circle or ClouredCircle
        // Uses toString() in Object class
        System.out.println(round1);
        System.out.println(round2);
        System.out.println(round1.toString());
        System.out.println(round2.toString());
        
        // Uncomment toString() in Circle and run again
        
        // Then uncomment toString in ColouredCircle and run again
        // - why does it not work ?
        // look at circle5 for a complete solution

    }
        
}
