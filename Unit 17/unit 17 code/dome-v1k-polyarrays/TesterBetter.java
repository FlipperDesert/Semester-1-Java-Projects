
/**
 * Write a description of class Tester here.
 * 
 * @author A.A.Marczyk 
 * @version 2017.10.18
 */
public class TesterBetter
{
    public static void main(String args[]){
        
        Database db = new Database();
        
        CD cd1 = new CD("Funky Music", "Joe Bloggs", 10, 80);
        CD cd2 = new CD("Boring Music", "Fred Bloggs", 7, 80);
                
        DVD dvd1 = new DVD("Psycho","Hitchcock",160);
        DVD dvd2 = new DVD("Bambi","Disney",100);
        
	    Item it1 = new Item("XXX",100);
	    Item it2 = new Item("YYY",200);
        Item icd3 = new CD("Metallica", "Metallica", 8, 100);
        Item idvd3 = new DVD("Alien","Universal",150);

        db.addItem(cd1);
        db.addItem(cd2);
        db.addItem(dvd1);
        db.addItem(dvd2);
        db.addItem(it1);
        db.addItem(it2);
        db.addItem(icd3);
        db.addItem(idvd3);

        db.addComment(cd1,"Dated");
        db.addComment(cd2,"Boring");
        db.addComment(dvd1,"Scary");
        db.addComment(dvd2,"Sweet");
        db.addComment(icd3,"Loud");
        db.addComment(idvd3,"Watch it !");
        
        db.setAllOwn();
        db.list();
    }
}
