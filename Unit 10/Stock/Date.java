/**
 * Simple Date Class - no error checking.
 * 
 * @author Mick Wood
 * @version Version 1.0 - amended by A.A.Marczyk 10/10/2003
 * 
 */
public class Date
{
    /* Fields of a Date - just the day, month and year*/
    private int day;
    private int month;
    private int year;
       
    /**
     * Parameterless constructor with date set to the default 1/1/2000 */
    public Date()
    {
        day = 1;
        month = 1;
        year = 2000;
    }

    /**
     * Constructor for creating a specific date.
     * @param d the day part of the date (1 - 31, depending on the month).
     * @param m the month part of the date (1 - 12).
     * @param y the year part of the date.
     */
    public Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }

    /**
     * allows the date to be set but no error checking in this version !
     * @param d the day part of the date (1 - 31, depending on the month).
     * @param m the month part of the date (1 - 12).
     * @param y the year part of the date.
     */
    public void setDate(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
    
    /**
     * returns a String representation of the date
     * @return the date as a String, int the format "09/11/2002"
     */
    public String toString ()
    {
        return as2Digits(day) + "/" + as2Digits(month) + "/" + year;
    }
    
    /* Internal method to add a leading zero if necessary. */
    private String as2Digits (int i)
    {
        if (i <10) {return "0" + i;}
        else {return "" + i;}
    }

    public int getMonthLength(int month)
    {
        switch(month)
        {
            case 4:
            case 6: 
            case 9: 
            case 11: return 30;
            case 2 : if(year%4 == 0) 
                     { return 29;}
                     else
                     { return 28;}
            default : return 31;
        }
    }
    
                     
// much nicer code !!!!!
    // how to change this to cope with any +ve d-value ?

    public void addDays(int d)
    {
        int tempday = day + d;
        if  (tempday > getMonthLength(month))
        {
            day = tempday - this.getMonthLength(month);
            month++;
        }
        if (month > 12)
        {
            year = year + 1;
            month = 1;
        }
    }


 
    // much nicer code
    // returns a number 1- 365/6 for a Date object

    public int julianDate()
    {
        int total = day;
        for ( int i = 1; i < month ; i++)
        {
            total = total + getMonthLength(i);
        }
        return total;
    }

}

