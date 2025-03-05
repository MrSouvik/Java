package DateTimeAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterClass_demo {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Current time : "+now);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
		String formattedDateTime = now.format(formatter);
		System.out.println("Formatted Date-Time: " + formattedDateTime);
		
		String dateTimeString = "2025-03-05 08:08:00";
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter1);
		System.out.println("Parsed Date-Time: " + dateTime);

	}
}
