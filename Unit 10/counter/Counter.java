/**
 * A simple integer counter.
 */
public class Counter {

    private int count;

    /**
     * Create a new Counter, with the count initialized
     * to 0.
     */
    public Counter () {
        count = 0;
    }

    /**
     * The number of items counted.
     */
    public int getCurrentCount () {
        return count;
    }

    /**
     * Increment the count by 1.
     */
    public void incrementCount () {
        count = count + 1;
    }
    /**
     * Decrement the count by 1 while count > 0
     * 
     */
    public void decrementCount(int num){
      if (count >= num){
        count = count -1;
      }
    }

    /**
     * Reset the count to 0.
     */
    public void reset () {
        count = 0;
    }

}
