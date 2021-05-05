package DataAndCalendar;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate localDate1 = LocalDate.of(2016, 06, 16);
		LocalDate localDate2 = LocalDate.of(2016, 06, 18);
		Period period= Period.between(localDate1, localDate2);
	System.out.println("16 June 2016 to 18 June 2016: Years :"+period.getYears()+ 
			" Months:"+period.getMonths()+ " Days"+period.getDays());
		}

}
