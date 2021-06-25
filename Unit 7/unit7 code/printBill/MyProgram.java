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
        int items = getQuantity();
        double cost = getPrice();
        double tally = calcTotal(items, cost);
        printBill(items, cost, tally);
    }

    // These are method definitions
    
    
    public int getQuantity()
    {
        String query = JOptionPane.showInputDialog(
        "How many items did you buy?");
        int quantity = Integer.parseInt(query);
        return quantity;
    }
    
    public double getPrice ()
    {
        String query = JOptionPane.showInputDialog("What did they cost?");
        double price = Double.parseDouble(query);
        return price;
    }
    
    public double calcTotal(int quantity, double price)
    {
        double total = quantity * price;
        return total;
    }
    
    public void printBill(int quantity, double price, double total)
    {
        System.out.println("The cost of " + quantity + " items at " + price + 
        " is " + total + ".");
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
