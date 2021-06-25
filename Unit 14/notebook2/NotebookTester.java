
/**
 * Write a description of class NotebookTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NotebookTester
{
    public static void main (String args[]){
        
        Notebook notes = new Notebook();
        notes.storeNote(new Note("Week 1","These are my coursenotes for week 1"));
        notes.storeNote(new Note("Instructions", "To get into London......"));
        notes.storeNote(new Note ("List of Courses", "The list of courses is: Sleeping for beginners, Advanced partying, Late Night Drinking for Dummies"));
        
        //another way of adding a note
        Note memo = new Note("Reminder", "Do Java exercises today");
        notes.storeNote(memo);
        //see that all notes are added as expected
        
        notes.showAllNotes();
        
        //Try retrieving a note
        Note note1 = notes.retrieveNote ("Instructions");
        //test note retrieval of a note that exists
        System.out.println(note1);//no explicit call to toString() here - it is called implicitly by the system
        //test note retrieval error situations
        Note note2 = notes.retrieveNote ("Note");
        //if you try to execute a method on null it will crash your system
        //System.out.println(note2); prints out null but it is still a dangerous thing to do
        if (note2 == null){
            System.out.println("attempted retrieval of Note with heading of 'Note' is null");
        }
         
       
        notes.showAllNotes();
        //test deleteNote
        notes.deleteNote("List of Courses");
        notes.showAllNotes();
    }
}
