
import java.awt.Color;

public class CircleTester
{
  public static void main (String args[])
  {    
    Circle circle = new Circle(30);
    System.out.println("The area of circle is: "+circle.getArea());
    ColouredCircle greenCircle = new ColouredCircle(Color.GREEN, 40);
    System.out.println("The area of greenCircle is: "+greenCircle.getArea() + 
    " and it's colour is "+greenCircle.getColour());
       
  }
}