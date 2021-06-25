
/**
 * Write a description of class ListRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListRunner
{
   public static void main (String[] args)
   {
       Student stud1 = new Student(1234, "Fred");
       Student stud2 = new Student(2345, "Mary");
       Student stud3 = new Student(3456, "Anil");
       Student stud4 = new Student(4567, "Olek");
       
       CourseList cs1 = new CourseList("Computer Science", 111111);
       CourseList cs2 = new CourseList("Networks", 222222);
       
       cs1.addStudent(stud1);
       cs1.addStudent(stud3);
       cs1.addStudent(stud4);
       
       cs2.addStudent(stud1);
       cs2.addStudent(stud2);
       
       System.out.println("**** cs1****");
       cs1.showAll();
       
       System.out.println("**** cs2****");
       cs2.showAll();
       
       System.out.println("\n****Update credits to stud1 in cs1****");
       cs1.updateCredits(stud1.getStudentNo(), 15);
       System.out.println("\n****Update credits to stud2 in cs1****");
       System.out.println("**** NO stud2 in cs1****");
       cs1.updateCredits(stud2.getStudentNo(), 15);
       cs1.showAll();
    }
}
