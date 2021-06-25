import java.awt.Color;

/**
 * ColouredCircle 
 */
public class ColouredCircle extends Circle
{
  private Color colour;
  
  /**
   * Constructor takes a java.awt.Color and circle radius
   */
  public ColouredCircle (Color c, double r){
      super(r);
      colour = c;
  }
  /**
   * Constructor takes the circle radius and sets default colour to Color.BLUE
   */
  public ColouredCircle(double r){
      super(r);
      colour = Color.BLUE;
      // OR this(Color.BLUE, r); // call this constructor above
  }
  /**
   * Constructor with no arguments defaults colour to Color.BLUE and radius = 100;
   */
  public ColouredCircle(){
    this(100.00);
  }
  
  public ColouredCircle(Color c){
    this(c,100.00);
  }
    
  /**
   * Returns java.awt.Color - the colour of this circle
   */
  public Color getColour(){
    return colour;
  }
  /**
   * Set the colour to the default which is Color.BLACK
   */
  public void setColour(){
    colour = Color.BLACK;
  }
  /**
   * Set the colour to the Color passed in as a parameter
   */
  public void setColour(Color c){
    colour = c;
  }
  /**
   *Set the colour to with a new Color composed the int values passed in.  
   *The range of each of these
   * values must be 0 - 255
   *
   */
  public void setColour(int r, int g, int b ){
    colour = new Color(r,g,b);
    
  }
}