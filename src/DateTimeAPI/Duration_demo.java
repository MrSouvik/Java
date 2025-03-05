package DateTimeAPI;

import java.time.Duration;
import java.time.LocalTime;

public class Duration_demo {
	public static void main(String[] args) {
		LocalTime time1 = LocalTime.of(12, 10);
		LocalTime time2 = LocalTime.of(13, 12);
		Duration duration = Duration.between(time1, time2);
		System.out.println("Duration : "+duration);
	}
}
