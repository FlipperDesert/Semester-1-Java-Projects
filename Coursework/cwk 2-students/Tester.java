
/**
 * Creates a Dome and tests method calls on it. 
 * 
 * @author (J Reece) 
 * @version (16/12/19)
 */
public class Tester
{   
    private Controller paradise = new Dome("Paradise Park");

    private void doTest()
    {

        System.out.println("\n********TEST 1********\n");
        // a string update of the dome at creation
        String testString = paradise.toString();
        System.out.println(testString);

        System.out.println("\n********TEST 2********\n");

        // getting all passes without location
        String testPasses = paradise.getAllPasses();
        System.out.println(testPasses);

        System.out.println("\n********TEST 3********\n");

        // moving multiple people through doors and testing
        // unconnected doors and passes with low tokens
        // and full caverns
        String move1 = paradise.enterCavern(1001, 0);
        String move2 = paradise.enterCavern(1002, 6);
        String move3 = paradise.enterCavern(1004, 0);
        String move4 = paradise.enterCavern(1005, 0);
        String move5 = paradise.enterCavern(1008, 0);
        String move6 = paradise.enterCavern(1009, 0);
        String move7 = paradise.enterCavern(1001, 4);
        String move8 = paradise.enterCavern(1009, 4);

        System.out.println(move1 + move2 + move3 + move4 + move5 
        + move6 + move7 + move8);
        

        System.out.println(paradise.passesInAllCaverns());

        System.out.println("\n********TEST 4********\n");

        // printing all passes in party cavern
        String partyPeople = paradise.passesInCavern("Party");
        System.out.println(partyPeople);

        System.out.println("\n********TEST 5********\n");

        // finding a user's location
        String testLocation = paradise.findPass(1009);
        System.out.println(testLocation);

        System.out.println("\n********TEST 6********\n");

        // topping up a user's tokens and checking their balance
        paradise.topUpTokens(1009, 10);

        // converting a gold user's loyalty points and checking balance
        paradise.convertPoints(1009);

        System.out.println("\n********TEST 7********\n");

        // moving a pass outside of the dome and checking its location
        System.out.println(paradise.moveToOutside(1009));
        testLocation = paradise.findPass(1009);
        System.out.println(testLocation);

        System.out.println("\n********TEST 8********\n");

        // evacuating the dome of all passes
        paradise.moveAll();
        testString = paradise.passesInAllCaverns();
        System.out.println(testString);

    }
     
    public static void main(String[] args)
    {
        Tester xx = new Tester();
        xx.doTest();
    }
}
