public class StudentTester{
	
	public static void main(String args []){
		Student s3 = new Student();  // won't compile
		//Method one:
		Date xxx = new Date(1,1,1990);
		Date gd = new Date(7,7,2009);
		String name = "Joe Bloggs";
		
		Student student1 = new Student(name,xxx,gd);
		String studentDetail = student1.toString();
		System.out.println(studentDetail);
		
		
		//method two:
		
		Student student2 = new Student ("Jane Doe",new Date(6,6,1989), new Date(8,7,2010));
		System.out.println(student2.toString());
		
		//or
		
		System.out.println(student2);
		
		//other functionality:
		
		System.out.println(student2.getName());
		Date d = student1.getDateOfBirth();
		System.out.println(d.getDate());
		
		//setting a revised graduation date
		
		student1.setGraduationDate(new Date (8,7,2010));
		System.out.println(student1);
		
	}
}