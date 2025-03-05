package DateTimeAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTime_demo {
	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println("Current date timt with Zoned : "+zdt);
		
		//To get zoned only
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("ZoneId : "+zone);
		
		//ZoneDateTime uses including zoneId class
		ZonedDateTime nzdt = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("US/Pacific"));
		System.out.println("New date Time including zone id : "+nzdt);
		
		//Available Zone ID 
		Set<String> avaliableIds = ZoneId.getAvailableZoneIds();
		System.out.println(avaliableIds);
		
	}
}
