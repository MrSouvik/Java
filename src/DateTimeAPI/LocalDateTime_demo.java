package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTime_demo {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Current date time : "+dateTime);
		
		LocalDateTime updateddateTime = dateTime.withDayOfMonth(2).withYear(2012);
		System.out.println("After Update : "+updateddateTime);
		
		//Manipulation methods
		//To get only date 
		LocalDate date = updateddateTime.toLocalDate();
		System.out.println("Local date extracting : "+date);
		//to get only time
		LocalTime time = updateddateTime.toLocalTime();
		System.out.println("Local time extracting : "+time);
		
		//To get day of the month
		System.out.println("Day of month : "+updateddateTime.getDayOfMonth());
		
		//To get the month
		System.out.println("Current month : "+updateddateTime.getMonth());
		
		//adding days
		System.out.println("After adding days : "+updateddateTime.plusDays(5));
		
		//Subtracting days 
		System.out.println("Aftre subtracting days : "+updateddateTime.minusDays(2));
	}
}
