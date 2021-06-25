
/**
 * Simple Circle class that has a radius
 */
public class Circle {
  private double radius;
  
  /**
   * Constructor takes the circle radius
   */
  public Circle(double r){
    radius = r;
  }
  /**
   * Constructor with no arguments defaults to radius = 100;
   */
  public Circle(){
    this(100.00);
  }
  /**
   * Returns the area as a double
   */
  public double getArea(){
    return (Math.PI * (radius*radius));
  }
  /**
   * returns the radius as a double
   */
  public double getRadius(){
    return radius;
  }
}
