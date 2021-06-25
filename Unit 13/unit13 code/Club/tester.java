import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tester
{
    public static void main(String[] arguments) {
        ClubList walkers = new ClubList();
        
        walkers.addMember("John");
        walkers.addMember("Joe");
        walkers.addMember("Jane");
        
        int count = walkers.getClubCount();
        System.out.println(count + " members");
        
        walkers.listAllMembers();
        boolean empty = walkers.hasMembers();
        System.out.println("Has members: " + empty);
        
        boolean test1 = walkers.isMember("Joe");
        boolean test2 = walkers.isMember("Johnny");
        System.out.println("Member: " + test1);
        System.out.println("Member: " + test2);
        
        String memberList = walkers.getAllMembers();
        System.out.println("Members: " + memberList);
        
        String input = JOptionPane.showInputDialog("Who is coming in?");
        Scanner reader = new Scanner(input);
        
        while (reader.hasNext()) {
            walkers.addMember(reader.next());
        }
        
        walkers.listAllMembers();
        
        String looking = JOptionPane.showInputDialog("Who are you looking for?");
        boolean test3 = walkers.isMember(looking);
        System.out.println("Member: " + test3);
    }
}
