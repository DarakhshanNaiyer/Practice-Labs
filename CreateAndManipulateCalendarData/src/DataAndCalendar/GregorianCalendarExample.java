package DataAndCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Calendar calendar = new GregorianCalendar ();
		
		int date = calendar.get(calendar.DATE);
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH);
		int dayOfmonth = calendar.get(calendar.DAY_OF_MONTH);
		int dayOfweek = calendar.get(calendar.DAY_OF_WEEK);
		int weekOfyear = calendar.get(calendar.WEEK_OF_YEAR);
		int weekOfmonth = calendar.get(calendar.WEEK_OF_MONTH);
		
		System.out.println(date);
		System.out.println(year);
		System.out.println(month);
		System.out.println(dayOfmonth);
		System.out.println(dayOfweek);
		System.out.println(weekOfyear);
		System.out.println(weekOfmonth);
		
		int date1 = calendar.get(Calendar.DATE);
		int year1 = calendar.get(Calendar.YEAR);
		int month1 = calendar.get(Calendar.MONTH);
		int dayOfmonth1 = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfweek1 = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfyear1 = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfmonth1 = calendar.get(Calendar.WEEK_OF_MONTH);
		
		System.out.println(date1);
		System.out.println(year1);
		System.out.println(month1);
		System.out.println(dayOfmonth1);
		System.out.println(dayOfweek1);
		System.out.println(weekOfyear1);
		System.out.println(weekOfmonth1);
	}

}
