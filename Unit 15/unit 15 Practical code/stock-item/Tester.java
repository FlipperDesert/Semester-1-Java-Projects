
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args)
    {
        StockItem bob;
        bob = new StockItem("Beans", 65 );
        bob.doDelivery(7);
        bob.printReport();
        bob.doSale(3);
        bob.printReport();
        bob.doSale(6);
        bob.printReport();
        
        PerishableStock milk = new PerishableStock("Milk", 99);
        milk.setShelfLife(12);
        milk.doDelivery(10);
        milk.doSale(3);
        String result = milk.toString();
        System.out.println(result);
    }
}
