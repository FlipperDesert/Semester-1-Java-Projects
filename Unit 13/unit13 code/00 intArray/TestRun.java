
/**
 * Write a description of class testRun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestRun
{
   public static void main(String[] args)
    {
        IntArray xxxx = new IntArray();
        
        xxxx.addInt(1);
        xxxx.addInt(2);
        xxxx.addInt(3);
        xxxx.addInt(4);
        xxxx.addInt(5);
        xxxx.addInt(6);
        xxxx.addInt(7);
        xxxx.addInt(3,10);
        xxxx.output();
        
        xxxx.removeInt(4);
        xxxx.output();
        
        System.out.println("*****find int****");
        System.out.println(xxxx.findIntPosition(10));
        System.out.println(xxxx.findIntPosition(20));
        
        System.out.println("*****get int****");
        System.out.println(xxxx.getInt(3));
        System.out.println(xxxx.getInt(6));
        System.out.println(xxxx.getInt(7));
        System.out.println(xxxx.getInt(20));
        
        System.out.println("*****get by value****");
        System.out.println(xxxx.getIntbyValue(3));
        System.out.println(xxxx.getIntbyValue(10));
        System.out.println(xxxx.getIntbyValue(20));
    }
}
