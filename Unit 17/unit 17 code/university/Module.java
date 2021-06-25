import java.util.*;
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    private String title;
    private int code;
    private ArrayList<Person> people;
    
    public Module(String titleIn, int id) {
        title = titleIn;
        code = id;
        people = new ArrayList();
    }
    
    public void addPerson(Person input) {
        people.add(input);
    }
    
    public void removePerson(String name) {
        for (Person tempPerson : people) {
            if (tempPerson.getName().equalsIgnoreCase(name)) {
                people.remove(tempPerson);
            }
        }
    }
    
    public String getNames() {
        String result = "";
        
        for (Person tempPerson : people) {
            result = result + tempPerson.getName() + "\n";
        }
        
        return result;
    }
    
    public String getInternational() {
        String result = "";
        
        for (Person tempPerson : people) {
            if (tempPerson instanceof Student && ((Student) tempPerson).isInternational()) {
                result = result + tempPerson.getName() + "\n";
                
            }
        }
        return result;
    }
    
    public String toString() {
        String result = "";
        
        for (Person tempPerson : people) {
            result = result + tempPerson.toString() + "\n";
        }
        return result;
    }
}
