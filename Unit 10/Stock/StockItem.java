import java.util.Date;
/**
 * Write a description of class StockItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StockItem
{
    private String description;
    private int level;
    private double price;
    private Date useBy = new Date(99/99/99);
    
    public StockItem(String type, double cost) {
        description = type;
        price = cost;
    }
    
    public void setPrice(double cost) {
        price = cost;
    }
    
    public void setUseBy(int year, int month, int date) {
        useBy.setDate(date);
        useBy.setMonth(month);
        System.out.println("Chk value frm setUseBy ::"+month);
        System.out.println("Chk value frm setUseBy ::"+useBy.getMonth());
        useBy.setYear(year);
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getStockLevel() {
        return level;
    }
    
    public void doDelivery(int amount) {
        level = level + amount;
    }
    
    public void doSale(int amount) {
        if (level > 0) {
            level = level - amount;
        } else {
            System.out.println("Sorry, this item is out of stock");
        }
    }
    
    public void printReport() {
        System.out.println("*******Stock Report*******");
        System.out.println("* Item: " + description);
        System.out.println("* price: " + price + "p");
        System.out.println("* Stock Level: " + level);
        System.out.println("* Use by: " + useBy.getDate() + ", " + 
        useBy.getMonth() + ", " + useBy.getYear() + "\n");
    }
}
