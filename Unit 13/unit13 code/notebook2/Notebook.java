import java.util.HashMap;//must provide this import to use ArrayList

/**
 * Stores "notes".  Notes are objects of the Note class
 */
public class Notebook
{
    // The ArrayList that stores the notes.
    private HashMap<Integer, Note> notes = new HashMap<Integer, Note>();  // declare
    // OR just declare & create
    // private ArrayList<Note> notes = new ArrayList<Note>();

    /**
     * Construct an empty notebook
     */
    public Notebook()
    {
         //create
    }

    /**
     * Store a new note into the notebook by appending it 
     * to the end of the current list of notes
     * @param note The note to be stored.
     */
    public void storeNote(int index, Note note)
    {
        if (notes.get(index) == null) {
            notes.put(index, note);
        }
    }
    /**
     * Retrieves the note stored in the position supplied as a parameter.  
     * The parameter must be >= 0 and < the number of notes in the notebook.
     * If the index parameter is out of this range null will be returned
     * @return the note 
     */
    public Note retrieveNote(int index){
        if (inBounds(index)){
            return notes.get(index);
        }
        return null;
    }
    
    public Note retrieveNote(String input) {
        for  (int i = 0; i < notes.size(); i++) {
            Note single = notes.get(i);
            String heading = single.getHeading();
            
            if (heading.equalsIgnoreCase(input)) {
                return single;
            }
        }
        return null;
    }
    
    // /**
     // * Inserts a Note into the Notebook in the position supplied as a parameter.  
     // * The parameter must be >= 0 and < the number of notes in the notebook.
     // * If the index parameter is out of this range no action will be taken
     // * @param int index at which the note should be inserted
     // * @param Note to be inserted 
     // */
    // public void insertNote(int index, Note n){
        // if(inBounds(index)){
            // notes.add(index, n);
        // }
    // }
    /**
     * Deletes the Note at the position supplied as a parameter.  
     * The parameter must be >= 0 and < the number of notes in the notebook.
     * If the index parameter is out of this range no action will be taken
     * @param int index of the Note to be deleted
     */
    public void deleteNote(int index){
        if (inBounds(index)){
            notes.remove(index);
        }
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Show all the notes contained in the note book.
     * 
     */
    public void showAllNotes()
    {
        int count = 0; 
        for (int i = 0; i < notes.size(); i++){
            Note n = notes.get(i);
            //note how the ++ operator is used below - it increments after the count has been printed
            // if ++count was written it would incremented first then printed - try it
            System.out.println((count++) + ": "+n);
        }
    }
    /*this is a private method.  It cannot be seen or accessed by anything outside this
    *class.  It does not have Javadoc style comments.  This comment is purely for learning
    * purposes.
    */
    private boolean inBounds(int index){
        return (index >=0 && index < notes.size());
    }
}
