/**
 * Student class.  This class shows how a class can contain other classes.
 * Stamp coupling
 */
public class Student{
	
	private Date dateOfBirth;
	private Date graduationDate;
	private String name;
	
	/**
	 *Create a Student with a name and date of birth and likely date of graduation
	 */
	public Student (String n, Date dob, Date graduationDate){
	    
	    name = n;
	    dateOfBirth = dob;
	    this.graduationDate = graduationDate;
	}
	
	public Student (String n, Date dob) {
	    name = n;
	    dateOfBirth = dob;
	    graduationDate = null;
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
	    if (graduationDate != null) {
	        return name +" dob: "+dateOfBirth.getDate()+" completion date:"+graduationDate.getDate();
	    } else {
		return name +" dob: "+dateOfBirth.getDate();
	    }
	}

}