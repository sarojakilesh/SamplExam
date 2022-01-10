package exceptions.basic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		Date date1 = new Date();
		System.out.println(date1.getDate());
		System.out.println(System.currentTimeMillis());
		System.out.println(date1);
		@SuppressWarnings("deprecation")
		Date date2 = new Date(2021, 5, 17);
		System.out.println(date2.after(date1));
		System.out.println(date1.getTimezoneOffset());


	
	String string1 = "May 18 2021 14:54:15"; 
	DateFormat format = new SimpleDateFormat("MMMM dd yyyy HH:mm:ss");
	Date date11 = format.parse(string1);
	System.out.println(date11);
	
	}

}
