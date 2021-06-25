import java.awt.Color;

public class CircleTester
{
    public static void main (String args[])
    {  
        Circle circle = new Circle(30);
        System.out.println("The area of circle is: "+circle.getArea());
        System.out.println("Circle toString is: "+ circle.toString());
        ColouredCircle greenCircle = new ColouredCircle(Color.GREEN, 40);
        System.out.println("The area of green circle is: "+ greenCircle.getArea());
        System.out.println("Green circle toString is: "+ greenCircle.toString());
        greenCircle.getColour();
        //circle.getColour();   // won't compile
    }
}