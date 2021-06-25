
/**
 * Write a description of class stockItem here.
 * 
 * This version is a solution to Practical 04, incorporating solutions to Task 2 and 9
 * @author A.Marczyk 
 * @version 24/11/2014
 */
public class StockItem implements Prioritisable
{
    private String description;
    private int quantity;
    private int price;
    private boolean onOrder;
//    private Date sellByDate;
    
    public StockItem(String desc, int pr)
    {
        description = desc;
        quantity = 0;
        price = pr;
        onOrder = false;
 //       sellByDate = new Date(1,1,2000);
    }
    
    public int getPriority()
    {
        return price;
    }

    /**
    public void setSellByDate(int dd, int mm, int yy)
    {
        sellByDate.setDate(dd,mm,yy);
    }
    **/
    
    public void setPrice(int pr)
    {
        price = pr;
    }
    
    public void setOnOrder()
    {
        onOrder = true;
    }
    
    public void doDelivery(int amount)
    {
        quantity = quantity + amount;
        onOrder = false;
    }
    
    public void doSale(int amount)
    {
        if ((quantity - amount) >= 0)
        {
            quantity = quantity - amount;
        }
    }
    
    public boolean orderMore()
    {
        if (quantity <= 5)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        // BUT this is neater
        //      return quantity <= 5;
     }
    
    
    public int getPrice()
    {
        return price;
    }
    
    public int getQuantity()
    {
        return quantity;
    }  
    
    public String toString()
    {
        String s = "*  Report on item: " + description + " priced at " + price + "p";
        s = s + "\n*  Current stock level : " + quantity;
        s = s + "\n*";
        return s;
    }   
    
    
}
