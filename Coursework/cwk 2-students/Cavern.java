import java.util.*;
/**
 * Stores and returns information on Cavern objects.
 * @param Name is the cavern name, rating is the rating required to 
 * enter, capacity is the maximum capacity of the room and passes 
 * is an ArrayList storing current passes inside the cavern.
 *
 * @author (J Reece)
 * @version (16/12/19)
 */
public class Cavern
{
    private String name;
    private int rating;
    private int capacity;
    private ArrayList<Pass> passes;

    /**
     * Constructor for objects of class Cavern
     * @param nom is the Cavern name, score is the rating and 
     * size is the capacity of the Dome
     */
    public Cavern(String nom, int score, int size)
    {
        name = nom;
        rating = score;
        capacity = size;
        passes = new ArrayList();
    }

    /**
     * Adds a pass to the passes list if there is room
     * @param tempPass is the pass to add
     */
    public void addPass(Pass tempPass) {
        if (passes.size() < capacity) {
            passes.add(tempPass);
        }
    }
    
    /**
     * Finds and removes a pass from the passes list
     * @param pId is the ID of the pass to remove
     */
    public void removePass(int pId) {
        for (int i = 0; i < passes.size(); i++) {
            if (inCavern(pId)) {
                Pass tempPass = passes.get(i);
                if (tempPass.getId() == pId) {
                    passes.remove(i);
                }
            }
        }
    }
    
    /**
     * Checks if a user is in the cavern passes list
     * @param pId is the ID of the Pass to check for
     */
    public boolean inCavern(int pId) {
        if (getPass(pId) != null) {
            return true;
        }
        return false;
    }
    
    /**
     * Returns the cavern name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the rating of the cavern
     */
    public int getRating() {
        return rating;
    }
    
    
    /**
     * Checks if the cavern is at capacity and returns true if there
     * is space
     */
    public boolean hasSpace() {
        if (passes.size() < capacity) {
            return true;
        }
        return false;
    }
    
    /**
     * Returns cavern information as a string
     */
    public String toString()
    {
        String result = "\nTotal number of visitors in " + name + 
        " cavern: " + passes.size() + "\n Capacity of cavern: " + 
        capacity + "\nRating of cavern: " + rating + 
        "\nList of current visitors: \n\n";
        
        for (Pass tempPass : passes) {
            result = result + tempPass.toString() + "\n";
        }
        
        return result;
    }
    
    /**
     * Gets a pass from the passes list using its ID number
     * @param id the Pass ID to find
     */
    private Pass getPass(int id)
    {
        for (Pass tempPass : passes) {
            if (tempPass.getId() == id) {
                return tempPass;
            }
        }
        return null;
    }
}
