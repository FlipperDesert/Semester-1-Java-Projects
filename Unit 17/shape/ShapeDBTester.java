import java.awt.Color; 

public class ShapeDBTester{
  public static void main (String args[]){
  	
  	ShapeDatabase database = new ShapeDatabase();
    
    Circle c1 = new Circle(Color.green, 30);
    Rectangle r1 = new Rectangle(Color.blue, 30,50);
    Triangle t1 = new Triangle (Color.yellow, 40, 60);
    Shape s1 = new Triangle(Color.pink, 100, 200);
    Shape s2 = new Circle(Color.red, 500);
    
    database.addShape(c1);
    database.addShape(r1);
    database.addShape(t1);
    database.addShape(s1);
    database.addShape(s2);
   // database.addShape(c1);
    database.printShapes(); 
    database.printCircles();
  }
}