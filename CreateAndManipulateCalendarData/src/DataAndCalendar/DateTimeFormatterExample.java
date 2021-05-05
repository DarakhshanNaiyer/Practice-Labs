package DataAndCalendar;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter DTF1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss z");
		DateTimeFormatter DTF2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");
		DateTimeFormatter DTF3 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss z");
		
		ZonedDateTime ZTD= ZonedDateTime.now();
		
		String formatter1 = DTF1.format(ZTD);
		String formatter2 = DTF2.format(ZTD);
		String formatter3 = DTF3.format(ZTD);

		System.out.println(formatter1);
		System.out.println(formatter2);
		System.out.println(formatter3);
		}

}
