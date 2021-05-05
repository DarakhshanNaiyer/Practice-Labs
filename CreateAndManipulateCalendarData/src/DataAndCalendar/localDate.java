package DataAndCalendar;

import java.time.LocalDate;
import java.time.ZoneId;

public class localDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate Today = LocalDate.now();
		System.out.println(" Today's Date:" + Today);
		
		LocalDate LocalDateZone = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		
      System.out.println("Today Date at Zone Amrica/Los_Angeles:" + LocalDateZone);
	}

}
