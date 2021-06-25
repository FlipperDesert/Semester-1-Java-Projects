
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{    
    /**
     * Constructor for objects of class Tester
     */
    public static void main(String[] args)
    {       
        //using different constructors
        SomeClass a = new SomeClass(4); 
        SomeClass b = new SomeClass(5, 7 );
        SomeClass c = new SomeClass(2.5);

        int answer1, result1;
        double answer2, result2, result3;
        
        //calling overloaded methods
//        answer1 = a.sampleMethod(7);   // int parameter OK, but not answer1
//        result1 = b.sampleMethod(4.5); // double parameter OK, but not result1
        
        //Explain the results of these overloaded method calls on object a
        //Which versions will be called ?
        answer2 = a.sampleMethod(7);     // int parameter OK
        System.out.println(answer2);
        result2 = a.sampleMethod(4.5);   // double parameter OK
        System.out.println(result2);
        result3 = a.sampleMethod(3,4);   // calling overloaded method
        System.out.println(result3 + "\n");
        
        // the same method calls of object b
        answer2 = a.sampleMethod(7);     // int parameter OK
        System.out.println(answer2);
        // BUT why is the result strange here ?
        result2 = b.sampleMethod(4.5);  
        // Is this OK ?
        System.out.println(result2);     // double parameter OK
        result3 = a.sampleMethod(3,4);   // calling overloaded method
        System.out.println(result3);
        
        // Now try them on object c
        
    }

    
}
