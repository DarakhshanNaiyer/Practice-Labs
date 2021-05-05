package DataAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date= new Date ();
		
		System.out.println(date);
		
		SimpleDateFormat Formatter= new SimpleDateFormat ("dd/MM/yyyy");
		
//		System.out.println(Formatter.format(date));//another way
		
		String StrDate = Formatter.format(date);
		
		System.out.println(StrDate);

	}

}
