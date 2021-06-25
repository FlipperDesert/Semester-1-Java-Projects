
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public void test() {
        TicketMachine tester = new TicketMachine(30);
        tester.insertMoney(20);
        tester.printTicket();
        tester.insertMoney(20);
        tester.printTicket();
        tester.refundBalance();
        int refund = tester.getBalance();
        System.out.println(refund);
    }
    
    public static void main (String[] args) {
        Tester ticket = new Tester();
        ticket.test();
    }
}
