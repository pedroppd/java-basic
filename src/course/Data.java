package course;

import java.awt.FocusTraversalPolicy;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Data {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date1 = sdf1.parse("20/12/1997");
		
		Date date2 = sdf2.parse("21/09/1970 23:12:03");
		
		System.out.println("data 1: " + sdf1.format(date1));
		System.out.println("data 2: " + sdf2.format(date2));
		
		Date x1 = new Date();  //current time
		System.out.println("X1: " + sdf1.format(x1));
		
		Date x2 = new Date(System.currentTimeMillis()); //another shape of have the current time
		System.out.println("x2: " + sdf1.format(x2));
		
		Date x3 = new Date(0L);
		System.out.println("x3: " + sdf1.format(x3));
		
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		System.out.println("x4: " + sdf1.format(x4));
		
		Date x5 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		sdf1.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println("x5: " +sdf1.format(x5));
	}
}
