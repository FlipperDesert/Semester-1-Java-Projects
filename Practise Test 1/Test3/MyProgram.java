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
            double length = areaCheck();
            double breadth = areaCheck();
            length = safeRectangleArea(length);
            breadth = safeRectangleArea(breadth);
            String area = rectangleArea(length, breadth);
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
        String input = JOptionPane.showInputDialog(
        "Enter a side for your rectangle");
        double side = Double.parseDouble(input);
        return side;
    }
    
    public String circleArea(double radius) {
        double area = Math.PI * radius * radius;
        String message = "The area of the circle is " + area;
        return message;
    }
    
    public String rectangleArea(double length, double breadth) {
        String message = "";
        if (length == -1 || breadth == -1) {
            message = "Rectangle area is -1, please insert positive digit";
        } else {
            double area = length * breadth;
            message = "The area of your rectangle is " + area;
        }
        return message;
    }
    
    public boolean numberOK(double number) {
        if (number >= 0) {
            return true;
        }
        return false;
    }
    
    public double safeRectangleArea(double number) {
        double side = -1;
        if (numberOK(number)) {
            side = number;
        }
        return side;
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
