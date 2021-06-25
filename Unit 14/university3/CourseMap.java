import java.util.*;
/**
 * Stores information about a course, including a list of students taking the course
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CourseMap
{
    private String name; 
    private int code;
    private HashMap<Integer,Student> courseMap = new HashMap<Integer,Student>(); // creates an empty list

    public CourseMap(String n, int c)
    {
        name = n;
        code = c;   
    }

    public void addStudent(Student s)
    { 
        int studKey = s.getStudentNo();
        courseMap.put(studKey, s);  // calls an HashMap method "add"
        // OR just: courseMap.put(s.getStudentNo(), s);
    }

    public Student findStudent(int stNo)
    { // compare to courseList & courseArray   
        return courseMap.get(stNo) ;       // returns null if not found
    } 
    
    public Student findStudentByName(String nme)
    {  // More difficult as student name is not a key
        Collection<Student> crse = courseMap.values();    // get the collection of values
        // do a linear search - so not much of a saving
        for (Student temp: crse)  // use a special loop
        {
            String tempName = temp.getName();
            // when comparing Strings use the String method equals()
            if (tempName.equals(nme))          // check temp's name
            {  
                return temp;                   // return if match found
            } // end of if
        } // end of loop
        return null;                 // return null if not found
    } // end of method

    public void showAll()
    {   // not much of a saving here either
        Collection<Student> crse = courseMap.values() ;  // get the collection of values
        for (Student temp: crse)  // use a special loop
        {
            System.out.println(temp.toString());
        }
        System.out.println("End");
    }
    
    public int getCount()
    {
        return courseMap.size();
    }

// Methods requiring the position of the student object are irrelevant
// Note: this code is identical to the one in CourseArray   
    public String getStudentName(int id)
    {
        Student lost = findStudent(id);
        if (lost != null)
        {
            return lost.getName(); //Student method
        }
        return "Not found";
    }
    
    public int getCredits(int id)
    {
        Student lost = findStudent(id);
        if (lost != null)
        {
            return lost.getCredits(); //Student method
        }
        return -1;
    }
    
    public void updateCredits(int id, int creds)
    {
        Student lost = findStudent(id);
        if (lost != null)
        {
            lost.addCredits(creds); //Student method
        }
    }
    

        
}
