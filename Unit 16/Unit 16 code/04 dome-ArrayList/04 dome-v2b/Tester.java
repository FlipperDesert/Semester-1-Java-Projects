
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String args[]){
        
        Database db = new Database();
        
        Item it = new Item("xxx", 100);
        CD cd1 = new CD("Funky Music", "Joe Bloggs", 10, 80);
        CD cd2 = new CD("Boring Music", "Joe Bloggs", 10, 80);
        
        DVD dvd1 = new DVD("Psycho","Hitchcock",160);
        DVD dvd2 = new DVD("Bambi","Disney",160);
        
        db.addItem(it);
        db.addItem(cd1);
        db.addItem(cd2);
        db.addItem(dvd1);
        db.addItem(dvd2);
        
        db.list();
        System.out.println("list2");
        db.list2();
    }
}
