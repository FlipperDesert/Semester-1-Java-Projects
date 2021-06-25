
/**
 * Write a description of class ShapeDatabase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShapeDatabase
{
    // instance variables - replace the example below with your own
    private Shape[] shapes;
    private int index = 0;

    /**
     * Constructor for objects of class ShapeDatabase
     */
    public ShapeDatabase()
    {
        shapes = new Shape[10];
    }

   
    public void addShape(Shape s)
    {
        if (index < shapes.length){
            shapes[index] = s;
            index++;
        }
    }
    public void printShapes(){
        Shape s ;
        for (int i = 0; i < index; i++){
            s = shapes[i];
            System.out.println(s);
        }
    }
    public void printCircles(){
        Shape s ;
        System.out.println("Printing Circles from the ShapeDatabase");
        for (int i = 0; i < index; i++){
            s = shapes[i];
            if (s instanceof Circle){
                Circle c = (Circle) s;
                System.out.println(c + " with radius of "+ c.getRadius());
                
            }
        }
    }
}
