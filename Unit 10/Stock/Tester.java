
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public void test() {
        StockItem bob = new StockItem("Baked Beans 415g", 65);
        bob.doDelivery(30);
        System.out.println(bob.getStockLevel());
        bob.doSale(30);
        System.out.println(bob.getStockLevel());
        bob.doSale(1);
        bob.doDelivery(25);
        bob.printReport();
    }
    
    public static void main(String[] arguments) {
        Tester myProgram = new Tester();
        myProgram.test();
    }
}
