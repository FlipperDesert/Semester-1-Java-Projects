
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntArray
{
    int[] list;
    int pointer;
    
    public IntArray()
    {
       list = new int[10];
       pointer = 0;
    }
    
    public void addInt(int x)
    {
        if (pointer < list.length)
        {
            list[pointer] = x; 
        }
        pointer++;
    }
    
    public void addInt(int pos, int x)
    {
        if (pos < list.length)
        {
            for ( int i = pointer; i>=pos; i--)
            {
                list[i + 1] = list[i];
            }
        }
        list[pos] = x;
        pointer++;
    }
   
    public void output()
    {
        for (int i = 0; i < pointer; i++)
        {
            System.out.println(list[i]);
        }
    }
    
    public void removeInt(int index)
    {
        for(int i = index; i< pointer; i++)
        {
            list[i] = list[i+1];
        }
        pointer--;
    }
    
    public int findIntPosition(int x)
    {
        for (int i = 0; i < pointer; i++)
        {
            if(list[i] == x)
            {
                return i;
            }
        }
        return -1;
    }
    
    public int getInt(int pos)
    {
        if (pos < pointer)
        {
            return list[pos];
        }
        return -1;
    }
    
    public int getIntbyValue(int value)
    {
        for (int i = 0; i < pointer; i++)
        {
            if((list[i] == value))
            {
                return list[i];
            }
        }
        return -1;
    }
    
}
