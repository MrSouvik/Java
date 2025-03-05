package DateTimeAPI;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTime_demo {
	public static void main(String[] args) {
		LocalTime t1 = LocalTime.now();
		System.out.println("Current time : "+t1);
		
		LocalTime t2 = LocalTime.of(5, 12,25);
		System.out.println("User defined time : "+t2);
		
		LocalTime t3 = LocalTime.parse("13:15:21");
		System.out.println("User defined parse time : "+t3);
		
		LocalTime t4 = LocalTime.ofNanoOfDay(1485952000);
		System.out.println("Time using nanoOfday : "+t4);
		
		LocalTime t5 = LocalTime.ofSecondOfDay(2548);
		System.out.println("Time using ofSecondOfDay : "+t5);
		
		//Manipulation method
		//LocalTime t6  = LocalTime.now().plus(2,ChronoUnit.HOURS);
		LocalTime t6 = LocalTime.now().plusHours(2);
		System.out.println("Time after adding 2 hours : "+t6);
		
		LocalTime t7 = LocalTime.now().minus(2,ChronoUnit.HOURS);
		//LocalTime t7 = LocalTime.now().minusHours(2);
		System.out.println("Time after substracting 2 hours : "+t7);
		
	}
}
