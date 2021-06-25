import java.util.ArrayList;
/**
 * Write a description of class ListTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListTester
{
    public static void main(String[]args)
   {
        Patient p1 = new Patient(111,"AAA","A1",1,2,2005);
        Patient p2 = new Patient(222,"BBB","B1",2,3,2005);
        Patient p3 = new Patient(333,"CCC","C1",3,4,2005);
        Patient p4 = new Patient(444,"DDD","D1",4,5,2005);
        
        AEUsersList lister = new AEUsersList();
        
        //different ways to add
        lister.addPatient(p1);
        lister.addPatient(p2);
        lister.addPatient(p3);
        lister.addPatient(p4);
        lister.addPatient(555,"EEE","C1",5,6,2009);
        lister.addPatient(new Patient(666,"FFF","A1",8,9,2008));
        lister.addPatient(2, new Patient(999,"ZZZ","A1",8,9,2008));
        lister.print();
        
        System.out.println("*********remove 4*******");
        lister.removePatient(4);
        System.out.println(lister.toString());
        
        lister.updateALL(2);
        lister.updatePatient(222, 3);
        
        System.out.println("*****find Patient****");
        System.out.println(lister.findPatientbyPNo(555));
        System.out.println(lister.findPatientbyPNo(888));
        System.out.println(lister.findPatientbyPNo(999));
        
        System.out.println("*****get Patient****");
        System.out.println(lister.getPatient(3));
        System.out.println(lister.getPatient(6));
        System.out.println(lister.getPatient(7));
        System.out.println(lister.getPatient(20));
        
        System.out.println("*****get Patient by PNo****");
        System.out.println(lister.getPatientbyPNo(999));
        System.out.println(lister.getPatientbyPNo(666));
        System.out.println(lister.getPatientbyPNo(222));
        
    }
      
}
