import java.awt.Color;
/**
 * Abstract class for a Shape
 **/
public abstract class Shape{
  
  private Color colour;
    
  public Shape (Color colour){
      this.colour = colour;
  }
  /**
   * Returns the area of a Shape
   **/
  public abstract double getArea();
  
  /**
   * Returns the colour of a Shape 
   **/
  public Color getColor(){
    return colour;
  }
  public String toString(){
      
    return "Shape: with colour: "+ colour + " and its area is "+getArea();
  }
}