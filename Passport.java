package classes;

public class Passport {
	
	//תכונות
	private String name;
	private int number;
	private Date expiryDate;
	
	//פעולה בונה (seters)
	public Passport (String name, int number, Date expirtyDate) {
		this.name = name;
		this.number = number;
		this.expiryDate = expiryDate;
	}
	
	//פעולה מעתיקה
	Passport (Passport pussport) {
		this.name = pussport.name;
		this.number = pussport.number;
		this.expiryDate = pussport.expiryDate;
	}
	
	//פעולת toString
    public String toString() {
    	return "Name: <" + name + "> + \n" + 
    	"Pass. nam: <" + number + "> + \n" + 
    	"Exp date: <" + expiryDate + "> + \n";
    }
	
    //get
    public boolean isValid(Date dateChecked) {
    	return expiryDate.compareTo(dateChecked) < 0;
    }
    
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
	
}
