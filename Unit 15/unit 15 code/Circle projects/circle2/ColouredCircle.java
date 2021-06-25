import java.awt.Color;

/**
 * ColouredCircle 
 */
public class ColouredCircle extends Circle{
  private Color colour;
  
  /**
   * Constructor takes a java.awt.Color and circle radius
   */
  public ColouredCircle (Color c, double r){
    super(r);
    colour = c;
  }
  
  /**
   * Returns java.awt.Color - the colour of this circle
   */
  public Color getColour(){
    return colour;
  }
  /**
   * Sets colour
   */
  public void setColour(Color c){
  	colour = c;
  }
  
}