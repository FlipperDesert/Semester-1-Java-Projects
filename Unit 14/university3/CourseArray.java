
 /**
 * Stores information about a course, including a list of students taking the course
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CourseArray
{
    private String name; 
    private int code;
    private int count = 0;
    //declare & create an array
    private Student[] course = new Student [20]; // creates an empty array of 10 

    public CourseArray(String n, int c)
    {
        name = n;
        code = c;        
    }

    public void addStudent(Student s)
    { 
        course[count] = s;
        count = count + 1;  // increment count
    }
    
    public Student findStudent(int stNo)
    {    
        for (int index = 0; index < count; index++)  // use a loop
        {
            Student temp = course[index];      //get each item from the array
            if (stNo == temp.getStudentNo())   // check its Student number
            {  
                return temp;                   // return if match found
            } // end of if
        } // end of loop
        return null;                 // return null if not found
    } // end of method
    
    public Student findStudentByName(String nme)
    {    
        for (int index = 0; index < count; index++)  // use a loop
        {
            Student temp = course[index];      //get each item from the array
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
    {
        int indx =0;
        while (indx < getCount())
        {
            Student temp = course[indx];
            System.out.println(temp.toString());
            indx = indx+1;
        }
        System.out.println("End");
    }
   
    public int getCount()
    {
        return count;
    }

// These methods only work if you know the position of th student object in the course array
// Note: usually you do NOT know the position of the student object in the array
    // get Student from Array and use a Student method
    public int getStudentNo(int index)
    {
        if(index>=0 && index<=count)
        {
            Student x = course[index];  
            return x.getStudentNo(); //Student method
        }
        return -1;
    }
    
    public void addStudentCredits(int index, int cred)
    {
        if(index>=0 && index<=count)
        {
            Student temp = course[index];
            temp.addCredits(cred);
        }
    }
    
    public int getStudentCredits(int index)
    {
        if(index>=0 && index<=count)
        {
            Student temp = course[index];
            return temp.getCredits();
        }
        return 0;
    }

// the above three methods are a bit useless as you usually don't know the objects position
// find the student from the array first
// Note: this code is identical to the one in CourseList    
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


