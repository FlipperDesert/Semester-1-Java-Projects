import java.awt.Color;
/**
 * Write a description of class CircleTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CircleTester
{
    public static void main (String args[]){
        
        Circle c1 = new Circle(Color.orange,3.5);
        Circle c2 = new Circle (Color.black,66.7);
        Circle c3 = new Circle(Color.white, 3.5);
        Circle c4 = null;
        //should not be equal
        System.out.println(c1.equals (c2));
        //should be equal
        System.out.println(c1.equals (c3));
        //should not be equal and should not crash
        System.out.println(c1.equals (c4));
        //should be false 
        System.out.println (c1 == c3);
        
        
        //hashCode
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        c4 = new Circle (Color.gray,66.7);
        System.out.println(c4.hashCode());
    }
        
}
