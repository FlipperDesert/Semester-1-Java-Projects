import java.awt.Color;
/**
 *Simple rectangle class
 **/
 
public class Square extends Shape{
  private int sides;
  
  /**
   * Constructor supplying width and height.  Values should be positive
   */
   
  public Square(Color c, int s){
    super(c);
    sides = s;
  }
  /**
   *Returns the area as a double
   */
   
  public double getArea(){
    return sides * sides;
  }
  
  public String describeType() {
      return "Square";
  }
  

}
