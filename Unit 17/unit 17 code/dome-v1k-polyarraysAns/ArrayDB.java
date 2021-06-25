 


/**
 * Write a description of class ArrayDB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayDB
{ 

    public static void doArray()
    {       
        DVD v = new DVD("Matilda","Disney",94);
        CD c = new CD("Metallica", "Metallica",9,75);
        Student s = new Student("Fred",123);
        
        Item[] myStuff = new Item[5];
        Item p = new Item("xxx",  100);
        Item pv1 = v;
        Item pc2 = c;
      
        //myStuff[0] = s;     //ERROR as s is a Student !!
        
        // BUT subtype references allowed by the compiler
        myStuff[0] = p;     //p is Item object
        myStuff[1] = v;     //v is DVD object
        myStuff[2] = c;     //c is CD object
        
        //p1 static type Item, current dynamic type CD
        myStuff[3] = pv1;    
        myStuff[4] = pc2;    // current dynamic type DVD 

        for(int i=0; i < myStuff.length; i++)
        {  // call supertype method
            myStuff[i].setOwn(true); 
        }
    
        for(int i=0; i < myStuff.length; i++)
        {  // call supertype method
            myStuff[i].print();         //overridden method
            System.out.println("==========================");
        }
    }
}
