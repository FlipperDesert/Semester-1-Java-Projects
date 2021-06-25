import java.util.*;//using more than one class from this package (util)

/**
 * Stores "notes".  Notes are objects of the Note class
 */
public class Notebook
{
    // The ArrayList that stores the notes.
    private HashMap<String, Note> notes;
    // OR just declare & create
    // private HashMap<String, Note> notes = new HashMap<String, Note>();

    /**
     * Construct an empty notebook
     */
    public Notebook()
    {
        notes = new HashMap<String, Note>();
    }

    /**
     * Store a new note into the notebook by appending it 
     * to the end of the current list of notes
     * @param note The note to be stored.
     */
    public void storeNote(Note note)
    {
        // Note the use of note.getHeading() as th
        notes.put(note.getHeading(), note);
    }
    /** OLD Comment:
     * Retrieves the note stored in the position supplied as a parameter.  
     * The parameter must be >= 0 and < the number of notes in the notebook.
     * If the index parameter is out of this range null will be returned
     * NEW Comment:
     * Retrieves the note using the heading as the key
     * No need for a "linear search"
     * @return the note 
     */
    public Note retrieveNote(String heading){
        return notes.get(heading);
    }
    
    /** OLD Comment
     * Deletes the Note at the position supplied as a parameter.  
     * The parameter must be >= 0 and < the number of notes in the notebook.
     * If the index parameter is out of this range no action will be taken
     * NEW Comment
     * Deletes the Note with the heading as key
     * @param int index of the Note to be deleted
     */
    public void deleteNote(String heading){
        
            notes.remove(heading);
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
     * New Comments : but this is more complex than the old version
     */
    public void showAllNotes()
    {
        Collection <Note>note_data = notes.values();
        Iterator<Note> it = note_data.iterator();
        while (it.hasNext()){
            
            System.out.println(it.next());
        }
    }
    
}
