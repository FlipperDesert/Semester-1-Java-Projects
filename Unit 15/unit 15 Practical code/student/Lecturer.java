
/**
 * Write a description of class Lecturer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lecturer extends Person
{
    private String department;
    private double salary;
    
    public Lecturer(int id, String name, String dept, double sal) {
        super(id, name);
        salary = sal;
        department = dept;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String toString() {
        String s = super.toString() + "\nDepartment: " + department +
        "\nSalary: " + salary;
        
        return s;
    }
}
