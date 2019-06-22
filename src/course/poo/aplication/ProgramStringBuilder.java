package course.poo.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramStringBuilder {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the momento of u post: ");
		Date moment = sdf.parse(sc.next());
		System.out.println("Enter the title of your post: ");
		String title = sc.nextLine();
		
		
	}

}
