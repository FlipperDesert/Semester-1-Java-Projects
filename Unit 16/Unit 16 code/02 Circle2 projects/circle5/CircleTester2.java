import java.awt.Color;

public class CircleTester2
{
    public static void main (String args[])
    {  
        Circle circle = new Circle(30);
        ColouredCircle greenCircle = new ColouredCircle(Color.GREEN, 40);
         
        // calling parent class methods, Both OK
        System.out.println("The area of circle is: "+circle.getArea()); 
        System.out.println("The area of green circle is: "+ greenCircle.getArea());
        
        // calling child class methods 
        //circle.getColour();   // won't compile why ?
         greenCircle.getColour(); //OK
        
         
        // calling toString()
        // there is no toString() in Circle, but this compiles
        // However, the output is strange
        System.out.println("Circle toString is: "+ circle.toString());
        // Runtime system uses the toString() in Object
        
        // there is no toString() in ColouredCircle, 
        // Nor is there one in the parent class Circle, but this compiles
        // However, the output is strange
        System.out.println("Green circle toString is: "+ greenCircle.toString());
        // Runtime system uses the toString() in Object
        
        
    }
}