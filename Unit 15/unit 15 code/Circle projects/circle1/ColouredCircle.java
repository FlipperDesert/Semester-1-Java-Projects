import java.awt.Color;

/**
 * ColouredCircle 
 */
public class ColouredCircle{
  private Color colour;
  private double radius;
  
  /**
   * Constructor takes a java.awt.Color and circle radius
   */
  public ColouredCircle (Color c, double r){
    radius = r;
    colour = c;
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
  
  /**
   * Returns java.awt.Color - the colour of this circle
   */
  public Color getColour(){
    return colour;
  }
  public void setColour(Color c){
  	colour = c;
  }
}