
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
  
//   /**
//    * returns a string version of the object
//    */
//   public String toString()
//   {
//       return "\nI am a circle with radius " + radius;
//   }

  
}
