import java.awt.Color;
/**
 *Simple rectangle class
 **/
 
public class Rectangle extends Shape{
  private int width;
  private int height;
  
  /**
   * Constructor supplying width and height.  Values should be positive
   */
   
  public Rectangle(Color c, int w, int h){
    super(c);
    width = w;
    height = h;
  }
  /**
   *Returns the area as a double
   */
   
  public double getArea(){
    return width * height;
  }
  
  public String describeType() {
      return "Rectangle";
  }

}
