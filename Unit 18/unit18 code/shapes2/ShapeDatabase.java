import java.util.*;
/**
 * Write a description of class ShapeDatabase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShapeDatabase
{
    // instance variables - replace the example below with your own
    private ArrayList<Shape> shapes;


    /**
     * Constructor for objects of class ShapeDatabase
     */
    public ShapeDatabase()
    {
        shapes = new ArrayList<Shape>();;
    }

   
    public void addShape(Shape s)
    {
        shapes.add(s);
    }
    public void printShapes(){
        Shape s ;
        for (Shape ttt : shapes){
            System.out.println(ttt.describeType());
        }
    }
    public void printCircles(){
        Shape s ;
        System.out.println("Printing Circles from the ShapeDatabase");
        for (Shape ttt : shapes){
            if (ttt instanceof Circle){
                Circle c = (Circle) ttt;
                System.out.println(c + " with radius of "+ c.getRadius());
                
            }
        }
    }
    
    public String allToString() {
        String result = "";
        for (Shape ttt : shapes) {
            result = result + ttt.toString() + "\n";
        }
        return result;
    }
}
