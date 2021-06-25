
/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
    public void runMyProgram()
    {
        //Write your code here
        int centimetres = 440;
        int metres = centimetres / 100;
        int point = centimetres % 100;
        
        System.out.println(centimetres + " centimetres is " + metres + 
        "." + point + " metres.");
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
