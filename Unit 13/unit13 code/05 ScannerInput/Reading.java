import java.util.*;
/**
 * Write a description of class Reading here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reading
{
    public static void main(String[] args)
    {
        // need to specify where data is coming from: System.in
        Scanner myInput = new Scanner(System.in);
        System.out.print ("Enter number ");
        int number = myInput.nextInt();
        System.out.print ("Enter price ");
        double price = myInput.nextDouble();
        System.out.print ("Enter item name ");
        // Notice that this does not seem to be "read"
        // because the <enter> from the previous read
        // is still in the buffer, and read instead
        // To sort this add (to "soak up" the previous <enter>:
        myInput.nextLine();
        String name = myInput.nextLine();
        
        double total = price * number;
        System.out.println ("\nTotal of " + number + " " + name +
        "s @ £" + price +" is £" + total);
        
    }

}
