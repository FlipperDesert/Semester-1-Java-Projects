
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main (String args[])
    {
        MessageList myNotes = new MessageList();
        myNotes.storeMessage("Meet John at 12.00");
        myNotes.storeMessage("Pay road Tax");
        myNotes.storeMessage("I'm late - overslept");
        myNotes.storeMessage("Finish assignment");
        // can also do this
        String memo = "Another message";
        myNotes.storeMessage(memo);
        
        //see that all messages are added as expected

        myNotes.showAllMessages();
        System.out.println("***********************");
        
        //Try retrieving a note
        String note1 = myNotes.getMessage (1);
        //test note retrieval of a note that exists
        System.out.println("Note no.1 is: " + note1);
        //test note retrieval error situations
        String note2 = myNotes.getMessage (8);
        //if you try to execute a method on null it will crash your system
        //System.out.println(note2); prints out null but it is still a dangerous thing to do
        if (note2 == null){
            System.out.println("No such message 8");
        }
        String note3 = myNotes.getMessage (-1);
        //if you try to execute a method on null it will crash your system
        //System.out.println(note2); prints out null but it is still a dangerous thing to do
        if (note3 == null){
            System.out.println("retrieval of -1 is null");
        }
        
        System.out.println("\nInsert message in position 0");
        //test insert of note
        myNotes.insertMessage(0, "I'm first now");
        System.out.println("Insert message in position 4");
        //test insert of note
        myNotes.insertMessage(4, "I'm fifth now");
        myNotes.showAllMessages();
        //test deleteNote
        System.out.println("\nDelete message in position 3");
        myNotes.deleteMessage(3);
        myNotes.showAllMessages();
    }
}
