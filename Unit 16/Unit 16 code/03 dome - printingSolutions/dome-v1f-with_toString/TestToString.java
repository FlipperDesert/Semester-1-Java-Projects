
/**
 * Testing toString()
 */
public class TestToString
{
    
    
    public static void main (String args[])
    {
        Item item = new Item("AAA", 20);
        DVD dvd = new DVD("Matilda","Disney",94);
        CD cd = new CD("Metallica", "Metallica",9,75);
        
        item.setComment("Not Sure");
        dvd.setComment("Wicked");
        cd.setComment("Loud");
        
        System.out.println("\n***** NOT using toString() *****");
        System.out.println("***print Item***");
        System.out.println(item);
        System.out.println("***print DVD***");
        System.out.println(dvd);
        System.out.println("***print CD***");
        System.out.println(cd);

        System.out.println("\n***** using toString() *****");
        System.out.println("***print Item***");
        System.out.println(item.toString());
        System.out.println("***print DVD***");
        System.out.println(dvd.toString());
        System.out.println("***print CD***");
        System.out.println(cd.toString());  
    }
}
