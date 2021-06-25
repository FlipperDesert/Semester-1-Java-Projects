/**
 *Simple circle class
 */
 import java.awt.Color;
public class Circle extends Shape{
  private double radius;
  
  /**
   *Create a circle with radius r
   */
  public Circle(Color c, double r){
    super(c);
    radius = r;
  }
  /**
   *get the area of this circle as a double
   */
  public double getArea(){
    return (Math.PI * (radius*radius));
  }
  /**
   *Get the radius as a double
   */
  public double getRadius(){
    return radius;
  }
  /**
   * Two circles are equal if their radii are equal.  
   * This is the overidden version of the method inherited from Object
   * @param o - another Circle
   */
  public boolean equals(Object o){
      if ((o != null) && (o instanceof Circle)){
          Circle otherCircle = (Circle)o;
          return otherCircle.getRadius() == radius;
        }
        return false;
    }
    /**
     * Returns an int which is a hashcode for this object. 
     * This is the overidden version of the method inherited from Object and the documentation states:
     * "If two objects are equal according to the equals(Object) method, 
     * then calling the hashCode method on each of the two objects must produce the same integer result" so 
     * the hashcode is generated from the radius.
     */
   public int hashCode(){
       //the class Double has a useful method
       return new Double(radius).hashCode();
    }
}
