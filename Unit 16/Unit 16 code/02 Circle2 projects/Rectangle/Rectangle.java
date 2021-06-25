
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    private int width;
    private int length;

    
    public Rectangle()
    {
        this(1,2);
    }
    public Rectangle (int w, int l){
        width = w;
        length = l;
    }

    public void setLength(int l){
            length = l;
    }
    public void setWidth(int w){
        width = w;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int getArea(){
        return width * length;
    }
}
