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
        String start = radOrRec();
        
        if (start.equalsIgnoreCase("c")) {
            double radius = radCheck();
            String area = circleArea(radius);
            System.out.println(area);
        } else if (start.equalsIgnoreCase("r")) {
            double rectangle = areaCheck();
            String area = rectangleArea(rectangle);
            System.out.println(area);
        }
        
    }
    
    public String radOrRec(){
        String choice = JOptionPane.showInputDialog(
        "Circle or Rectangle? Enter C or R");
        return choice;
    }
        
    public double radCheck() {
        String input = JOptionPane.showInputDialog(
        "What is the radius of your circle?");
        double output = Double.parseDouble(input);
        return output;
    }
    
    public double areaCheck() {
        String input1 = JOptionPane.showInputDialog(
        "What is the length of your rectangle?");
        double length = Double.parseDouble(input1);
        String input2 = JOptionPane.showInputDialog(
        "What is the breadth of your rectangle?");
        double breadth = Double.parseDouble(input2);
        return length * breadth;
    }
    
    public String circleArea(double radius) {
        double area = Math.PI * radius * radius;
        String message = "The area of the circle is " + area;
        return message;
    }
    
    public String rectangleArea(double area) {
        String message = "The area of your rectangle is " + 
        area;
        return message;
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
