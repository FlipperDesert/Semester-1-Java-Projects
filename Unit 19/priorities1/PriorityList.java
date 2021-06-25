import java.util.*;
/**
 * PriorityList allows items to be inserted in a list according to their 
 * priority.An item with priority 3 will be stored ahead of an item with
 * priority 2.Items with the same priority will be stored in the order in 
 * which they are added,so when an new item with the same priority is added
 * it will be stored after other items with the same priority. The precise
 * meaning of "priority" depends on the class of objects stored.   
 *
 * @author A.Marczyk 
 * @version 24/11/14
 **/
public class PriorityList
{
    private ArrayList<Prioritisable> list = new ArrayList<Prioritisable>();
    
    /** Constructor creates an empty priority list with length 0 **/    
    public PriorityList()
    {
    }
 
    /** 
    * Adds an item in a place appropriate to its priority.
    * 
    * If the priority list is empty, the item will be added at the start 
    * of the list.If the priority list contains at least one item, the 
    * item is added in a position appropriate to its priority.An item with
    * priority 3 will be stored ahead of an item with priority 2.Items,with
    * the same priority will be stored in the order in which they are added. 
    * @param item must be of a class which implements the Prioritisable 
    **/
    public void add(Prioritisable item)
    {
        if ( list.isEmpty())
        {
            list.add(item);
        }
        else
        {
            int i = 0;
            boolean inserted = false;
            while ( i < list.size() && !inserted)
            {
                Prioritisable x = list.get(i);
                if (x.getPriority() < item.getPriority())
                {
                    list.add(i,item);
                    inserted = true;
                }
                else
                {
                    i++;
                }
            } 
            if (! inserted)
            {
                list.add(i,item);
                inserted = true;
            }          
        } 
    }
    
    /** Removes the item at the specified position.
     *  The first item is in position 0
     *  the gap created by the removal of an item is closed
     *  @param i represents the position of the item
     */
    public void remove(int i)
    {
        list.remove(i);
    }
    
    /** Removes all the items in the list
     */
    public void clear()
    {
        list.clear();
    }
    
    /**Returns the number of items in the list
     * @return number of items in the list
     */
    public int size()
    {
        return list.size();
    }
    
    /**Returns true if the list has no items, false otherwise
     * @return true if list is empty, false otherwise
     */
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    
    /**Searches for the first occurence of the given argument, testing 
     * for equality using the equals method.
     * @param s represents the item whose position in the list is sought
     * @return the position of the object given as a parameter
     */
    public int indexOf(Prioritisable s)
    {
        return list.indexOf(s);
    }
    
    public String toString()
    {
        String s = "\n";
        for (Prioritisable element : list)
        {
            s = s + element.toString() + "\n";
        }
        return s;
    }
    
}   


