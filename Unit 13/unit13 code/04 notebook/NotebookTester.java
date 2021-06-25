
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
        Note note1 = notes.retrieveNote (1);
        Note noteS = notes.retrieveNote("Instructions");
        //test note retrieval of a note that exists
        System.out.println(note1);//no explicit call to toString() here - it is called implicitly by the system
        System.out.println("Test result: " + noteS);
        //test note retrieval error situations
        Note note2 = notes.retrieveNote (8);
        //if you try to execute a method on null it will crash your system
        //System.out.println(note2); prints out null but it is still a dangerous thing to do
        if (note2 == null){
            System.out.println("retrieval of 8 is null");
        }
         Note note3 = notes.retrieveNote (-1);
        //if you try to execute a method on null it will crash your system
        //System.out.println(note2); prints out null but it is still a dangerous thing to do
        if (note3 == null){
            System.out.println("retrieval of -1 is null");
        }
        //test insert of note
        notes.insertNote(0, new Note("Inserted note", "Note to test the insertNote method"));
        notes.showAllNotes();
        //test deleteNote
        notes.deleteNote(2);
        notes.showAllNotes();
    }
}
