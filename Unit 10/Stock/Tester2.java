
/**
 * Write a description of class Tester2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester2
{
    public void mainMethod() {
        StockItem product1 = new StockItem("Baked beans 415g", 65);
        product1.doDelivery(15);
        
        StockItem product2 = new StockItem("Eggs (box of 6)", 175);
        product2.doDelivery(10);
        
        StockItem product3 = new StockItem("Bread", 89);
        product3.doDelivery(7);
        
        product3.setPrice(99);
        product1.doDelivery(10);
        product2.doSale(3);
        
        product1.printReport();
        product2.printReport();
        product3.printReport();
        
        
    }
    
    public static void main(String[] arguments) {
        Tester2 test = new Tester2();
        test.mainMethod();
    }
}
