
/**
 *Simple Date class for composition demonstration
 */
public class Date{
	
	private int day;
	private int month;
	private int year;
	
	
	/**
	 *Construct new Date with day as int, month as int and year as int
	 */
	public Date (int day, int month, int year){
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	/**
	 *Get the day of this date as an int
	 */
	public int getDay(){
		return day;
	}
	/**
	 *Get the month of this date as an int
	 */
	public int getMonth(){
		return month;
	}
	/**
	 *Get the year of this date as an int
	 */
	public int getYear(){
		return year;
	}
	/**
	 *Get this date as a String in the format: d-m-y
	 */
	public String getDate(){
		return day+"-"+month+"-"+year;
	}
}