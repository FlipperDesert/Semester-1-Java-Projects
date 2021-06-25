
/**
 * Write a description of class PerishableStock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PerishableStock extends StockItem
{
    private int shelfLife;
    
    public PerishableStock (String desc, int pr) {
        super(desc, pr);
        shelfLife = 0;
        
    }
    
    public void setShelfLife(int useBy) {
        shelfLife = useBy;
    }
    
    public int getshelfLife() {
        return shelfLife;
    }
}
