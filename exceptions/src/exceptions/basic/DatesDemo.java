package exceptions.basic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DatesDemo {
	public static void main(String[] args) throws ParseException {
		Date date1 = new Date();
		System.out.println(date1.getDate());
		System.out.println(System.currentTimeMillis());
		System.out.println(date1);
		Date date2 = new Date(2021, 5, 17);
		System.out.println(date2.after(date1));
		System.out.println(date1.getTimezoneOffset());

		//
		//String pattern = "dd/MM/yyyy HH:mm:ss";

		//DateFormat df = new SimpleDateFormat(pattern);

		//Date today = Calendar.getInstance().getTime();

		//String todayAsString = df.format(today);

		//System.out.println("Today is: " + todayAsString);
		//System.out.println("Character is: " + todayAsString.charAt(8));   

		//TimeZone tz = TimeZone.getDefault();
		//System.out.println(tz);
		//String[] str = tz.getAvailableIDs();
		//int count = 0;
		//for (String string : str) {
			//System.out.println(string);
			//count++;
		//}
		//System.out.println(count);
	
		//
		
	
		//1.  string to date  
//	String string = "May 18 2021";
//	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yyyy");
//	LocalDate date = LocalDate.parse(string, formatter);
//	{
//	System.out.println(date);
//	}
	
	//2.
	String string1 = "May 18 2021 14:54:15"; 
	DateFormat format = new SimpleDateFormat("MMMM dd yyyy HH:mm:ss");
	Date date11 = format.parse(string1);
	System.out.println(date11);
	
	}

}
