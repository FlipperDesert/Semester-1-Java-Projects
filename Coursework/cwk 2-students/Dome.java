import java.util.*;
/**
 * Creates a dome object.
 * @param name is the dome name, doors is an ArrayList
 * of connected Doors, passes is an ArrayList of Passes inside the
 * dome, caverns is a HashMap of Caverns.
 * 
 * @author (J Reece) 
 * @version (16/12/19)
 */
public class Dome implements Controller
{
    private String name;
    private ArrayList<Door> doors;
    private ArrayList<Pass> passes;
    private HashMap<String, Cavern> caverns;
    

    /** constructor
     * Add all passes and add to collection
     * Create caverns with doors; add each to its collection
     * @param domeName the dome name
     */
    public Dome(String domeName) 
    {
        name = domeName;
        doors = new ArrayList();
        passes = new ArrayList();
        caverns = new HashMap();
        
        
        createCavernsWithDoors();
        addAllPasses();
    }
    
    // add methods specified in Controller
    /** Returns the name of the dome
     * @return name of the dome
     **/
    public String getDomeName() {
        return name;
    }
    
    /** Returns all information about the current state of the dome, 
     * including all passes in all caverns, by cavern name
     * @return all information about the current state of the the dome
     **/
    public String toString(){
        String result = "Dome name: " + name + "\nPasses by cavern: \n" + 
        passesInAllCaverns() + "\n Connecting doors: \n";
        
        for (Door temp : doors) {
            result = result + temp.toString() + "\n";
        }
        
        
        return result;
    }
    
    /** Returns information about all passes (but not location)
     * @return all information about all passes
     **/
    public String getAllPasses() {
        String result = "";
        for (Pass tempPass : passes) {
            result = result + tempPass.toString() + "\n";
        }
        
        return result;
    }
    
    /** 
     * Return the names of all the caverns
     **/
    public String getCavernNames() { 
        String names = "";
        
        for (String key : caverns.keySet()) {
            Cavern tempCavern = getCavern(key);
            names = names + tempCavern.getName() + "\n";
        }
        
        return names;
    }

    /** Returns a String representation of all the passes in the
     * specified cavern
     * @param cName the name of the specified cavern
     * @return a String representation of all passes in the Cavern
     **/    
    public String passesInCavern(String cName) {
        Cavern tempCavern = getCavern(cName);
        String result = tempCavern.toString();
        
        return result;
    }
    
    
    /**Returns a String representation of all the passes in all caverns (by cavern)
     * @return a String representation of all passes in all caverns
     **/
    public String passesInAllCaverns() {
        String names = "";
        
        for (String key : caverns.keySet()) {
            Cavern tempCavern = getCavern(key);
            names = names + tempCavern.toString() + "\n";
        }
        
        return names;
    }
    
    
    /**Returns the result of a pass wanting to enter through a 
     * door.Entry will be successful if:  
     * the rating of the pass  >= the rating of the destination cavern
     * AND the destination cavern is not full
     * AND the pass has sufficient tokens
     * AND the pass is currently in the source cavern
     * If the door allows entry, the pass is removed from the 
     * source cavern, added to the destination cavern and a suitable 
     * message returned.If the door does not allow entry, the 
     * state of the system remains unchanged and a suitable message 
     * specifying the reason is returned.
     * @param pId is the id of the pass requesting to enter
     * @param dNo is the number of the door through which the pass
     * wants to enter
     * @return a String which includes pass id, pass name, name of 
     * destination cavern and giving the result of the request 
     **/
    public String enterCavern(int pId, int dNo) {
        Pass tempPass = getPass(pId);
        Door tempDoor = getDoor(dNo);
        Cavern destCavern = tempDoor.getDestination();
        Cavern sourceCavern = tempDoor.getSource();
        
        if (canEnter(pId, dNo)) {
            tempDoor.enter(tempPass);
            return "User " + tempPass.getName() + 
            " has entered cavern " + destCavern.getName() + "\n\n";
        }
        
        return "Entry failed for " + tempPass.getName() + "\nMeets rating: " 
        + (tempPass.getRating() >= destCavern.getRating()) + "\nHas tokens: " + 
        tempPass.hasTokens() + "\nCavern has space: " + destCavern.hasSpace() + 
        "\nUser in cavern: " + sourceCavern.inCavern(pId) + "\n\n";
    }
    
    
    /**Returns true if a pass is allowed to enter through the door, 
     * false otherwise.Entry can be made if:  
     * the rating of the pass  >= the rating of the destination cavern
     * AND the destination cavern is not full
     * AND the pass has sufficient tokens
     * AND the pass is currently in the source cavern
     * @param pId is the id of the pass requesting the move
     * @param dNo is the number of the door through which the pass 
     * wants to enter
     * @return true if the pass can enter through the door,else 
     * false
     **/
    public boolean canEnter(int pId, int dNo) {
        Pass tempPass = getPass(pId);
        Door tempDoor = getDoor(dNo);
        Cavern destCavern = tempDoor.getDestination();
        Cavern sourceCavern = tempDoor.getSource();
        
        if (tempPass.getRating() >= destCavern.getRating() 
        && destCavern.hasSpace() && tempPass.hasTokens() && 
        sourceCavern.inCavern(pId)) {
            return true;
        }
        
        
        return false;
    }
    
    /**Returns the cavern which contains the specified pass
     * @param pId is the id of the specified pass
     * @return the name of the Cavern which contains the pass
     **/
    public String findPass(int pId) {
        Pass tempPass = getPass(pId);
        String result = "User " + tempPass.getName() + " is in Cavern ";
        
        for (String key : caverns.keySet()) {
            Cavern tempCavern = getCavern(key);
            if (tempCavern.inCavern(pId)) {
                result = result + tempCavern.getName();
            }
        }
        
        return result;
    }
    
    /** Allows a pass to top up its tokens.This method is not 
     * concerned with the cost of a token as charges may vary 
     * between facilities.
     * @param pId the id of the pass toping up its tokens
     * @param tkns the number of tokens purchased to be added to
     * the pass.
     */
    public void topUpTokens(int pId, int tkns) {
        Pass tempPass = getPass(pId);
        tempPass.addTokens(tkns);
        System.out.println("Updated balance for " + tempPass.getName() 
        + ": " + tempPass.getTokens() + " tokens (+" + tkns + ")");
    }
            
    /** Converts a loyalty pass's loyalty points into tokens
     * @param pId the id of the pass whose points are to be converted
     */
    public void convertPoints(int pId) {
        Pass tempPass = getPass(pId);
        
        if (tempPass instanceof Gold) {
            ((Gold)tempPass).toToken();
            
        } else {
            System.out.println("Sorry, " + tempPass.getName() + " does not have a Gold pass");
        }
    }
    
    /** Moves a pass directly to the outside without affecting 
     * tokens or other information and using emergency exits
     * @param pId the id of the pass to be moved to outside
     * @return a message giving the user's name and "to outside"
     */
    public String moveToOutside(int pId) {
        Pass tempPass = getPass(pId);
        
        for (String key : caverns.keySet()) {
            Cavern tempCavern = getCavern(key);
            if (tempCavern.inCavern(pId)) {
                tempCavern.removePass(pId);
            }
        }
        Cavern destination = getCavern("Outside");
        destination.addPass(tempPass);
        
        return tempPass.getName() + " is outside.";
    }

    /** In an emergency, moves all passes directly back to 
     * the outside  without affecting tokens or other 
     * information using emergency exits
     */
    public void moveAll() {
        for (Pass tempPass : passes) {
            int idNo = tempPass.getId();
            moveToOutside(idNo);
        }
    }
    
    // ***************private methods***********************
    /**
     * Creates a list of caverns and connects them to doors to 
     * create the Dome
     */
    private void createCavernsWithDoors()
    {
        Cavern outside = new Cavern("Outside", 0, 100);
        Cavern party = new Cavern("Party", 1, 30);
        Cavern solo = new Cavern("Solo", 1, 1);
        Cavern techno = new Cavern("Techno", 5, 2);
        Cavern sports = new Cavern("Sports", 3, 10);
        
        caverns.put(outside.getName(), outside);
        caverns.put(party.getName(), party);
        caverns.put(solo.getName(), solo);
        caverns.put(techno.getName(), techno);
        caverns.put(sports.getName(), sports);
        
        Door door0 = new Door(0, getCavern("Outside"), getCavern("Party"));
        Door door1 = new Door(1, getCavern("Party"), getCavern("Sports"));
        Door door2 = new Door(2, getCavern("Sports"), caverns.get("Party"));
        Door door3 = new Door(3, getCavern("Techno"), getCavern("Party"));
        Door door4 = new Door(4, getCavern("Party"), getCavern("Solo"));
        Door door5 = new Door(5, getCavern("Solo"), getCavern("Party"));
        Door door6 = new Door(6, getCavern("Sports"), getCavern("Techno"));
        
        doors.add(door0);
        doors.add(door1);
        doors.add(door2);
        doors.add(door3);
        doors.add(door4);
        doors.add(door5);
        doors.add(door6);
       
    }
    
    /**
     * Creates a list of Passes to populate the dome and assigns
     * them to the Outside cavern
     */
    private void addAllPasses()
    {
        Business anil = new Business("Anil", 5, 10, "Oxo");
        Gold bob = new Gold("Bob", 3);
        Staff chen = new Staff("Chen", 123, "Catering");
        Business dan = new Business("Dan", 1, 12, "Knorr");
        Business ezra = new Business("Ezra", 5, 3, "Oxo");
        Gold felek = new Gold("Felek", 3);
        Staff guy = new Staff("Guy", 234, "Security");
        Business han = new Business("Han", 5, 20, "Knorr");
        Gold helmut = new Gold("Helmut", 8);
        Business tobias = new Business("Tobias", 3, 16, "Retirement");
        Staff dahlia = new Staff("Dahlia", 345, "PR");
        Business silvio = new Business("Silvio", 4, 25, "Golf");
        
        passes.add(anil);
        passes.add(bob);
        passes.add(chen);
        passes.add(dan);
        passes.add(ezra);
        passes.add(felek);
        passes.add(guy);
        passes.add(han);
        passes.add(helmut);
        passes.add(tobias);
        passes.add(dahlia);
        passes.add(silvio);
        
        moveAll();
    }
    //     
    /** Returns the cavern with the name specified by the parameter
     * @return the cavern with the specified name
     **/
    private Cavern getCavern(String cavernName)
    {        
        return caverns.get(cavernName);
    }    

    /** Returns the door with the number specified by the parameter
     * @return the door with the specified number
     **/
    private Door getDoor(int dNo)
    {
        return doors.get(dNo);
    }
    
    /** Returns the pass with the id specified by the parameter
     * @return the pass with the specified id
     **/
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
