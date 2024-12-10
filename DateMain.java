package classes;

public class DateMain {

	public static void main(String[] args) {
		
		Date date1 = new Date(12, 8, 2022);
        Date date2 = new Date(15, 10, 2021);
        Date date3 = new Date(12, 8, 2022);

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Date 3: " + date3);
        
        System.out.println("Comparing date1 to date2: " + date1.compareTo(date2)); // צריך להחזיר מספר חיובי
        System.out.println("Comparing date2 to date1: " + date2.compareTo(date1)); // צריך להחזיר מספר שלילי
        System.out.println("Comparing date1 to date3: " + date1.compareTo(date3)); // צריך להחזיר 0 (שווה)

        System.out.println("Year of date1: " + date1.getYear());
        System.out.println("Month of date1: " + date1.getMonth());
        System.out.println("Day of date1: " + date1.getDay());

        date1.setYear(2024);
        date1.setMonth(9);
        date1.setDay(25);

        System.out.println("Date 1 after setting new values: " + date1);

	}

}
