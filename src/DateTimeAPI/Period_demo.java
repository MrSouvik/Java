package DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class Period_demo {
	public static void main(String[] args) {
		LocalDate bdate = LocalDate.of(1999, 7, 11);
		LocalDate currDate = LocalDate.now();
		Period age = Period.between(bdate, currDate);
		System.out.println("Age : "+age);
		
		//get date
		System.out.println("Date : "+age.getDays());
		//get month
		System.out.println("Month : "+age.getMonths());
		//get year 
		System.out.println("Year : "+age.getYears());
	}
}
