import javax.swing.JOptionPane;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
    public void runMyProgram()
    {
        //Write your code here
        int[] myDB = fillDatabase();   // function call
        
        int searchFor = 5;
        int result = search (myDB, searchFor);  //function call
        if (result != -1)
        {
            System.out.println(searchFor + " is in position " + result);
        }
        else
        {
            System.out.println(searchFor + " is not in the database ");
        }
        System.out.println("Check the array");
        printDB(myDB);
        
    }
    
// Method definitions
    /* method to fill the DB with random numbers
    */       
    public int[] fillDatabase()
    {
        int [] db = new int [20];
        
        for (int i = 0; i < db.length; i++)
        {
            db[i] = new java.util.Random().nextInt(25);
        }
        return db;
    }
        
    /* method to search a int[] using a search key
    */
    public int search (int[] db, int skey)
    { 
        for (int i = 0; i < db.length; i++)
        { 
            if (skey == db[i])
            {
               return i;
            }
        }
        return -1;
    }
    
    public void printDB(int[] database) {
        for (int i = 0; i < database.length; i++) {
            System.out.print(database[i]);
        }
        System.out.println("");
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
