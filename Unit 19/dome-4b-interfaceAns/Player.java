
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private Playable[] playList;
    private int listPointer;
    
    public Player()
    {
        playList = new Playable[20];
        listPointer = 0;
    }
    
    
    public void addToList(Playable pl)
    {
       if (listPointer < playList.length){
            playList[listPointer] = pl;
        }
        listPointer++; 
    }
    
    public void playOnPC(Playable pl)
    {
        if (pl.canPlayOnPC())
        {
            pl.play();
        }
    }
    
    public void list()
    {
        // print list of Playable objects
        for(int i = 0; i < listPointer; i++) {
            System.out.println(playList[i].toString());
            System.out.println();   // empty line between items
        }
    }
}
