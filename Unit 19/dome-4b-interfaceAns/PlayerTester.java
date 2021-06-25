
/**
 * Write a description of class PlayerTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerTester
{
    public static void main(String args[])
    {   Player pl = new Player();
        
        CD cd1 = new CD("Funky Music", "Joe Bloggs", 10, 80);
        DVD dvd1 = new DVD("Psycho","Hitchcock",160);
        AudioBook b1 = new AudioBook("Snuff", " T.Pratchett"," T.Robinson", 90, 120);
        
        //Polymorphic creation
        Item cd2 = new CD("Disco Music", "Fred Bloggs", 10, 80);
        Item dvd2 = new DVD("Matilda","Disney",160);
        Item b2 = new AudioBook("Dwarves", " T.Pratchett"," T.Robinson", 90, 120);
        
        //Playable cd3 = new CD("Boring Music", "Fred Bloggs", 7, 80);
        Playable dvd3 = new DVD("Bambi","Disney",100);
        Playable b3 = new AudioBook("Witches", " T.Pratchett"," T.Robinson", 80, 100);

        //pl.addtoList(cd3);        
        pl.addToList(dvd3);
        pl.addToList(b3);
        
        //pl.addtoList(cd2);        
        //pl.addToList(dvd2);
        //pl.addToList(b2);
        
        //polymorphic method call
        //pl.addPlayable(cd1);
        pl.addToList(dvd1); 
        pl.addToList(b1);
        
        //pl.playOnPC(cd1);
        pl.playOnPC(dvd1);       
        pl.playOnPC(b1);        
        //pl.playOnPC(cd2);
        //pl.playOnPC(dvd2);
        //pl.playOnPC(b2);
        //pl.playOnPC(cd3);
        pl.playOnPC(dvd3);
        pl.playOnPC(b3);
        
        System.out.println("******Playable objects**********");
        pl.list();
    }
}
