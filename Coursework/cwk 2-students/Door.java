
/**
 * Creates a one-way Door object which takes a user from a source 
 * cavern and places them in a destination
 * @param doorNum is the ID number of the door, source is the input 
 * cavern and destination is the output cavern
 *
 * @author (J Reece)
 * @version (16/12/19)
 */
public class Door
{
    private int doorNum;
    private Cavern source;
    private Cavern destination;

    /**
     * Constructor for objects of class Door
     * @param num is the door number, src is the source cavern
     * and dst is the destination cavern
     */
    public Door(int num, Cavern src, Cavern dst)
    {
        doorNum = num;
        source = src;
        destination = dst;
    }
    
    /**
     * Returns the door number
     */
    public int getDoorNum() {
        return doorNum;
    }
    
    /**
     * Returns the source cavern
     */
    public Cavern getSource() {
        return source;
    }
    
    /**
     * returns the destination cavern
     */
    public Cavern getDestination() {
        return destination;
    }
    
    /**
     * Removes the pass from the source cavern and enters them into
     * a destination cavern
     * @param tempPass is the moving Pass
     */
    public void enter(Pass tempPass) {
        int pId = tempPass.getId();
        source.removePass(pId);
        destination.addPass(tempPass);
        tempPass.enterCavern();
    }
    
    /**
     * Returns a string of information about the door
     */
    public String toString()
    {
        String result = "Door #: " + doorNum + "\nSource cavern: " + source.getName() + 
        "\nDestination cavern: " + destination.getName() + "\n";
        
        return result;
    }
    
}
