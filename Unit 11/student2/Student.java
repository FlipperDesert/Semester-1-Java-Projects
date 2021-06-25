/**
 * Student class.  This class shows how a class can contain other classes.
 */
public class Student{
	
	private String name;
	
	
	/**
	 *Create a Student with a name and date of birth and likely date of graduation
	 */
	public Student (String n, int dobDay, int dobMonth, int dobYear, int gradDay, 
                    int gradMonth, int gradYear){
		
		name = n;
		dateOfBirth = new Date(dobDay, dobMonth, dobYear);
		this.graduationDate = new Date(gradDay, gradMonth, gradYear) ;
	}
	
	                                       
	/**
	 *Get the name the student as a String
	 */
	public String getName(){
		return name;
	}
	/**
	 *Get the date of birth as a Date
	 */
	public Date getDateOfBirth(){
		return dateOfBirth;
		
	}
	/**
	 *Get the date of graduation
	 */
	public Date getGraduationDate(){
		return graduationDate;
	}
	
	/**
	 *set the graduation date 
	 */
	public void setGraduationDate(Date gd){
		graduationDate = gd;
	}
	
	public String toString(){
		return name +" dob: "+dateOfBirth.getDate()+" completion date:"+graduationDate.getDate();
	}

}