
/**
 * This will not compile because StockItem does not have getPriority()
 * and although Student does have this method it has not declared this 
 * by stating that it implements the Prioritisable interface
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
	public static void main(String[] args)
    {
        PriorityList myList= new PriorityList();
        PriorityList stockList= new PriorityList();
        
        
	    Student s1 = new Student ("Fred", 123);
	    // Student has getPriority BUt does not declare that it "implements" the Prioritisable interface
	    // fix by adding "implements Prioritisable " in Student
	    myList.add(s1);
	    myList.add(new Student ("Jo", 234));
	    myList.add(new Student ("Anil", 345));
	    myList.add(new Student ("Chen", 250));
	    System.out.println("Students");
	    System.out.println(myList.toString());
	    System.out.println("***************************************");
	    // StockItem does not have getPriority()
	    // fix by adding "implements Prioritisable " in Student
	    // then define a getPriority()
	    stockList.add(new StockItem("Bread", 67));
	    stockList.add(new StockItem("Eggs", 90));
	    stockList.add(new StockItem("Milk", 75));
	    stockList.add(new StockItem("Butter", 70));
	    System.out.println("Stock List");
	    System.out.println(myList.toString());
	    System.out.println("***************************************");
	    
	    
	}	    
}
