import java.awt.Color;
/**
 *Simple Triangle class
 */
public class Triangle extends Shape{
  private int base;
  private int height;
  
  /**
   *Construct a triangle with a supplied base and height
   */
  public Triangle (Color c, int b, int h){
    super(c);
    base = b;
    height = h;
  }
  /**
   *Return the area of the triangle as a double
   */
   
  public double getArea(){
    return (base/2)* height;
  }
}
