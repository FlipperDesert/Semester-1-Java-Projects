
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        ClockDisplay mine = new ClockDisplay();
        ClockDisplay yours = new ClockDisplay(12,38);
        
        mine.timeTick();
        System.out.println(mine.getTime());
        yours.timeTick();
        System.out.println(yours.getTime());
        mine.setTime(3,59);
        System.out.println(mine.getTime());
        mine.timeTick();
        System.out.println(mine.getTime());
        yours.timeTick();
        yours.setTime(23,59);
        System.out.println(yours.getTime());
        yours.timeTick();
        System.out.println(yours.getTime());
        
    }
    
}
