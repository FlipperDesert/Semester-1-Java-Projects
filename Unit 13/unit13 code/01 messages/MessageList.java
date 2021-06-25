import java.util.ArrayList;//must provide this import to use ArrayList

/**
 * Stores "messages".  Messages are just Strings
 */
public class MessageList
{
    // The ArrayList that stores the messages.
    private ArrayList<String>  messages; // declare
    // OR just declare & create

    /**
     * Construct an empty messageList
     */
    public MessageList()
    {
         messages = new ArrayList<String>(); //create
    }

    /**
     * Store a new message into the messageList by appending it 
     * to the end of the current list of messages
     * @param message The message to be stored.
     */
    public void storeMessage(String mess)
    {
        messages.add(mess);
    }
    /**
     * Retrieves the message stored in the position supplied as a parameter.  
     * The parameter must be >= 0 and < the number of messages in the messageList.
     * If the index parameter is out of this range null will be returned
     * @return the message 
     */
    public String getMessage(int index){
        if (isInBounds(index)){
            return messages.get(index);
        }
        return null;
    }
    /**
     * Inserts a message into the messageList in the position supplied as a parameter.  
     * The parameter must be >= 0 and < the number of messages in the messageList.
     * If the index parameter is out of this range no action will be taken
     * @param int index at which the message should be inserted
     * @param message to be inserted 
     */
    public void insertMessage(int index, String n){
        if(isInBounds(index)){
            messages.add(index, n);
        }
    }
    /**
     * Deletes the message at the position supplied as a parameter.  
     * The parameter must be >= 0 and < the number of messages in the messageList.
     * If the index parameter is out of this range no action will be taken
     * @param int index of the message to be deleted
     */
    public void deleteMessage(int index){
        if (isInBounds(index)){
            messages.remove(index);
        }
    }

    /**
     * @return The number of messages currently in the messageList.
     */
    public int numberOfMessages()
    {
        return messages.size();
    }

    /**
     * Show all the messages contained in the message List.
     * 
     */
    public void showAllMessages()
    {
        int count = 0; 
        for (String temp: messages){
            System.out.println((count++) + ": "+ temp);
        }
    }
    
    /*this is a private method.  It cannot be seen or accessed by anything outside this
    *class.  It does not have Javadoc style comments.  This comment is purely for learning
    * purposes.
    */
    private boolean isInBounds(int index){
        return (index >=0 && index < messages.size());
    }
}
