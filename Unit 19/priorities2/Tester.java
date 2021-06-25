
/**
 * Write a description of class Tester here.
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
        PriorityList waitingList= new PriorityList();

        Student s1 = new Student ("Fred", 234);
        myList.add(s1);
        myList.add(new Student ("Jo", 123));
        myList.add(new Student ("Anil", 345));
        myList.add(new Student ("Chen", 250));
        System.out.println("Students");
        System.out.println(myList.toString());
        System.out.println("***************************************");
    
        stockList.add(new StockItem("Bread", 67));
        stockList.add(new StockItem("Eggs", 90));
        stockList.add(new StockItem("Bread", 75));
        stockList.add(new StockItem("Bread", 70));
        System.out.println("Stock List");
        System.out.println(stockList.toString());
        System.out.println("***************************************");
        
        waitingList.add(new Patient(123,"AAA","zzz",1));
        waitingList.add(new Patient(234,"BBB","zzz",4));
        waitingList.add(new Patient(345,"CCC","zzz",2));
        waitingList.add(new Patient(456,"DDD","zzz",2));
        waitingList.add(new Patient(567,"EEE","zzz",2));
        waitingList.add(new Patient(678,"FFF","zzz",1));
        System.out.println("Waiting List");
        System.out.println(waitingList.toString());
        System.out.println("***************************************");       
    }       
}
