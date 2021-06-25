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
       String itemQuantity = JOptionPane.showInputDialog("Enter item quantity");
       String itemName = JOptionPane.showInputDialog("Enter item name");
       String itemPrice = JOptionPane.showInputDialog("Enter item price");
       
       int quant = Integer.parseInt(itemQuantity);
       double price = Double.parseDouble(itemPrice);
       
       double vat = (price / 100) * 20;
       
       double total = price + vat;
       
       System.out.println("The total price of " + quant + " copies of " 
       + itemName + " is: " + (total * quant));
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
