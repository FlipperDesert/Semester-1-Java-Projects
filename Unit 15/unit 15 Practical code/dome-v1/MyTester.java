
/**
 * Write a description of class MyTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyTester
{   
    public static void main(String args[])
    {
        
        Database db = new Database();
        
        Item bitem = new Item("Bitem", 69);
        
        CD cd1 = new CD("Funky Music", "Joe Bloggs", 10, 80);
        CD cd2 = new CD("Boring Music", "Joe Bloggs", 10, 80);
        
        DVD dvd1 = new DVD("Psycho","Hitchcock",160);
        DVD dvd2 = new DVD("Bambi","Disney",160);
        
        db.addItem(bitem);
        db.addCD(cd1);
        db.addCD(cd2);
        db.addDVD(dvd1);
        db.addDVD(dvd2);
        
        db.list();
    }

}
