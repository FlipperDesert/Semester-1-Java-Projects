import java.util.*;
/**
 * Stores information about a course, including a list of students taking the course
 * 
 * @author A.Marczyk 
 * @version 29/11/2016
 */
public class CourseList
{
    private String name; 
    private int code ;
    private ArrayList<Student> courseList = new ArrayList<Student>(); // creates an empty list

    public CourseList(String n, int c)
    {
        name = n;
        code = c;   
    }

    /**
     * Adds at student to a course
     * 
     * @param s is the student to be added
     */
    public void addStudent(Student s)
    { 
        courseList.add(s);  // calls an ArrayList method "add"
    }

    /** 
     * Finds a student using a student number
     * 
     * @param stNo the student number 
     * @return the student with the given student number
     */
    public Student findStudent(int stNo)
    {    
        for (int index = 0; index < courseList.size(); index++)  // use a loop
        {
            Student temp = courseList.get(index);      //get each item from the array
            if (stNo == temp.getStudentNo())   // check its Student number
            {  
                return temp;                   // return if match found
            } // endif
        } // endloop
        return null;                 // return null if not found
    } // end of method
    
    public Student findStudentByName(String nme)
    {    
        for (int index = 0; index < courseList.size(); index++)  // use a loop
        {
            Student temp = courseList.get(index);    //get each item from the arraylist
            String tempName = temp.getName();
            // when comparing Strings use the String method equals()
            if (tempName.equals(nme))          // check temp's name
            {  
                return temp;                   // return if match found
            } // endif
        } // endloop
        return null;                 // return null if not found
    } // end of method

    
    public void showAll()
    {
        int indx =0;
        while (indx < courseList.size())
        {
            Student temp = courseList.get(indx);
            System.out.println(temp.toString());
            indx = indx+1;
        }
        System.out.println("End");
    }
    
    public int getCount()
    {
        return courseList.size();
    }

// These methods only work if you know the position of th student object in the course array
// Note: usually you do NOT know the position of the student object in the array
    // get Student from ArrayList and use Student method
    public int getStudentNo(int index)
    {
        if(index>=0 && index<=courseList.size())
        {
            Student x = courseList.get(index);  // calls an ArrayList method "get"
            return x.getStudentNo(); //Student method
        }
        return -1;
    }
    
    public void addStudentCredits(int index, int cred)
    {
        if(index>=0 && index<=courseList.size())
        {
            Student temp = courseList.get(index);
            temp.addCredits(cred);
        }
    }
    
    public int getStudentCredits(int index)
    {
        if(index>=0 && index<=courseList.size())
        {
            Student temp = courseList.get(index);
            return temp.getCredits();
        }
        return 0;
    }

// the above three methods are a bit useless as you usually don't know the objects position
// find the student from the arraylist first 
// Note: this code is identical to the one in CourseArray   
 
    public String getStudentName(int id) //accessor
    {
        Student lost = findStudent(id); // use this method defined earlier
        if (lost != null)
        {
            return lost.getName(); //Student method
        }
        return "Not found";
    }
    
    public int getCredits(String name) //accessor
    {
        Student lost = findStudentByName(name); // use this method defined earlier
        if (lost != null)
        {
            return lost.getCredits(); //Student method
        }
        return -1;
    }
    
    public void updateCredits(int id, int creds)  //mutator
    {
        Student lost = findStudent(id);
        if (lost != null)
        {
            lost.addCredits(creds); //Student method
        }
    }
    

        
}
