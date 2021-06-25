import javax.swing.JOptionPane;

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
        double length1 = 4.0;
        double breadth1 = 6.0;
        
        String perimiter1 = perimiter(length1, breadth1);
        System.out.println(perimiter1);
        
        String area1 = rectangleArea(length1, breadth1);
        System.out.println(area1);
        
        String ringArea1 = ringArea(7,4,5,2);
        System.out.println(ringArea1);
        
        double rad = radCheck();
        String area2 = circleArea(rad);
        System.out.println(area2);
        
        double circleLoop = 30;
        
        for (int i = 10; i < circleLoop+1; i = i + 5) {
            String area3 = circleArea(i);
            System.out.println(area3);
        }
        
        double[] numArray = {18.4, 0.5, 3.5, 9};
        
        for (int i = 0; i < numArray.length; i++) {
            String area4 = circleArea(numArray[i]);
            System.out.println(area4);
        }
        
    }
    
    public String perimiter(double length, double breadth) {
        double perimiter = (length + breadth) * 2;
        String message = "The perimiter of a " + length + 
        " by " + breadth + " rectangle is " + perimiter;
        return message;
    }
    
    public String rectangleArea(double length, double breadth) {
        double area = length * breadth;
        String message = "The area of a " + length + " times " + 
        breadth + " rectangle is " + area;
        return message;
    }
    
    public String ringArea(double length, double breadth, 
    double innerL, double innerB) {
        double area1 = length * breadth;
        double area2 = innerL * innerB;
        double areaFinal = area1 - area2;
        String message = "The area of your rectangle with the " + 
        "middle taken out is " + areaFinal;
        return message;
    }
    
    public double radCheck() {
        String input = JOptionPane.showInputDialog(
        "What is the radius of your circle?");
        double output = Double.parseDouble(input);
        return output;
    }
    
    public String circleArea(double radius) {
        double area = Math.PI * radius * radius;
        String message = "The area of the circle is " + area;
        return message;
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
