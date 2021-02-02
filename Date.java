package Lecture07;

public class Date {
	
	// Fields
	private int month;
	private int day;
	private int year;
	
	//Zero-parameter constructor
	public Date() {
		month = 1;
		day = 1;
		year = 2002;
	}
	
	//Three-parameter constructor	
	public Date(int theMonth, int theDay, int theYear) {
		month = theMonth;
		day = theDay;
		year = theYear;
	}
	
	//Return true if two equal values
	public boolean equals(Object rhs) {		
		
		if (!(rhs instanceof Date))
			return false;
		
		Date rhDate = (Date) rhs;
		return rhDate.month == month && rhDate.day == day && rhDate.year == year;		
	
	}
	
	// Conversion to String
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
}

