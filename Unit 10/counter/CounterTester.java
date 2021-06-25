import javax.swing.JOptionPane;
/**
 * Tester for the class Counter.
 */
public class CounterTester {

    /**
     * Display and test the functionality of the Counter class
     */
    public void count() {
        Counter test = new Counter();
    	Counter test2 = new Counter();
    	Counter test3 = new Counter();
    	
    	while (test2.getCurrentCount() < 100) {
    	    test2.incrementCount();
    	}
   	
    	for (int i = 0; i < 100; i++) {
    	    test.incrementCount();
    	    
    	    for (int j = 100; j != 0; j--) {
    	        test2.decrementCount(j);
    	        
    	    }
    	}
    	
    	System.out.println(test.getCurrentCount());
    	System.out.println(test2.getCurrentCount());
    	
    	String input = JOptionPane.showInputDialog("What number do you want to count to?");
    	int target = Integer.parseInt(input);
    	
    	while (test3.getCurrentCount() < target) {
    	    test3.incrementCount();
    	    System.out.println(test3.getCurrentCount());
    	}
    	
    }

    public static void main (String[] args) {
    	CounterTester counter = new CounterTester();
    	counter.count();
    }
}
