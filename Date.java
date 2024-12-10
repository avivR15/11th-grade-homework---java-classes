package classes;

public class Date {
	
	
	private int day;
	private int month;
	private int year;

	public Date (int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	
	
	
	public void setYear(int yearToSet) {
		this.year = year;
	}
	
	public void setMonth(int monthToSet) {
		this.month = month;
	}
	
	public void setDay(int dayToSet) {
		this.day = day;
	}
	
	
    public int compareTo(Date other) {
        if (this.year != other.year) {
            return this.year - other.year;
        }
        
        if (this.month != other.month) {
            return this.month - other.month;
        }

        return this.day - other.day;
    }
    
    
    
	
	public String toString() {
		return "<" + day + ">.<" + month + ">.<" + year + ">";
	}
	




}
