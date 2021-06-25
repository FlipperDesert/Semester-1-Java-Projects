/** Testing print methods
 * No print method in Item.
 * Reduced print methods in DVD and CD
 */

public class TestPrint
{
       
       
    public static void main (String args[])
    { 
        DVD dvd = new DVD("Matilda","Disney",94);
        CD cd = new CD("Metallica", "Metallica",9,75);
        Item item = new Item("xxx",  100);
    
        item.setComment("Not Sure");
        dvd.setComment("Wicked");
        cd.setComment("Loud");
        
        System.out.println("***print Item***");
        item.print(); 
        System.out.println("***print DVD***");
        dvd.print();
        System.out.println("***print CD***");
        cd.print();
        
    } 
}
