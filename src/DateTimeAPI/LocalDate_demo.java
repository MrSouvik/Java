package DateTimeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDate_demo {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		System.out.println("Todays Time : "+d1);
		
		LocalDate d2 = LocalDate.of(2002,12,25);
		System.out.println("Date is d2: "+d2);
		
		LocalDate d3 = LocalDate.parse("2003-06-28");
		System.out.println("Date is d3 : "+d3);
		
		//LocalDate manipulation methods
		
		//add
		//LocalDate d4 = LocalDate.now().plus(2,ChronoUnit.DAYS);
		LocalDate d4 = LocalDate.now().plusDays(2);
		System.out.println("Date after adding 2 days : "+d4);
		
		//minus
		LocalDate d5 = LocalDate.now().minus(2,ChronoUnit.DAYS);
		//LocalDate d5 = LocalDate.now().minusDays(2);
		System.out.println("Date after reducing 2 days :"+d5);
	}
}
