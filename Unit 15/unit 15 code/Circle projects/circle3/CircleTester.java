
import java.awt.Color;

public class CircleTester
{
  public static void main (String args[])
  {
    Circle circ1 = new Circle(10); 
    //demonstration of using overloaded constructors
    ColouredCircle c1 = new ColouredCircle(Color.GREEN, 40);
    ColouredCircle c2 = new ColouredCircle(16);
    ColouredCircle c3 = new ColouredCircle();
    System.out.println("The area of circ1 is: "+circ1.getArea());
    System.out.println("The area of c1 is: "+c1.getArea() + " and it's colour is "+c1.getColour());
    System.out.println("\nThe area of c2 is: "+c2.getArea() + " and it's colour is "+c2.getColour());
    System.out.println("\nThe area of c1 is: "+c3.getArea() + " and it's colour is "+c3.getColour());
    System.out.println("\n\n\nCall the overloaded setColour() methods........");
    c1.setColour();
    c2.setColour(Color.red);
    c3.setColour(133, 43, 254);
    System.out.println("\nThe area of c1 is: "+c1.getArea() + " and it's colour is "+c1.getColour());
    System.out.println("\nThe area of c2 is: "+c2.getArea() + " and it's colour is "+c2.getColour());
    System.out.println("\nThe area of c1 is: "+c3.getArea() + " and it's colour is "+c3.getColour());
  }
}