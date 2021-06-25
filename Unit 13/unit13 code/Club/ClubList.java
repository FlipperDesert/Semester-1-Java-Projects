import java.util.ArrayList;
/**
 * Write a description of class ClubList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClubList
{
    ArrayList<String> members = new ArrayList<String>();
    
    public void addMember(String member) {
        members.add(member);
        
    }
    public int getClubCount() {
        return members.size();
        
    }
    public void listAllMembers() {
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i));
            
        }
    }
    public boolean hasMembers() {
        if (!(members.isEmpty())) {
            return true;
        }
        return false;
    }
    public String getMember(int member) {
        return members.get(member);
        
    }
    public boolean isMember(String member) {
        if (members.indexOf(member) != -1) {
            return true;
        }
        return false;
    }
    public String getAllMembers() {
        String result = "";
        
        for (int i = 0; i < members.size(); i++) {
            result = result + members.get(i) + "\n";
        }
        return result;
    }
}
