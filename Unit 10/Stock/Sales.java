import javax.swing.JOptionPane;
/**
 * Write a description of class Sales here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sales
{
    public void mainMethod() {
        StockItem product2 = new StockItem("Eggs (box of 6)", 175);
        product2.doDelivery(10);
        product2.setUseBy(2019, 11, 20);
        
        String input = JOptionPane.showInputDialog("How many boxes of eggs do you want?");
        int choice = Integer.parseInt(input);
        
        if (choice <= product2.getStockLevel()) {
            product2.doSale(choice);
        } else {
            System.out.println("We don't have that many eggs in stock");
        }
        
        product2.printReport();
    }
    
    public static void main(String[] arguments) {
        Sales tracker = new Sales();
        tracker.mainMethod();
    }
}
