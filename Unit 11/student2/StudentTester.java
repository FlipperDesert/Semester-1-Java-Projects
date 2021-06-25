public class StudentTester{
	
	public static void main(String args []){
		
		//Method one:
				
		Student student1 = new Student("Anil",1,2,1987,2,12,2003);
		String studentDetails = student1.toString();
		System.out.println(studentDetails);
		
				
		//other functionality:
		
		System.out.println(student2.getName());
		Date d = student1.getDateOfBirth();
		System.out.println(d.getDate());
		
		//setting a revised graduation date
		
		student1.setGraduationDate(new Date (8,7,2010));
		System.out.println(student1);
		
	}
}