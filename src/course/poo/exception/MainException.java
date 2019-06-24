package course.poo.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] vect = sc.nextLine().split(" ");
		try {
			int position = sc.nextInt();

			System.out.println(vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid position: " + e.getMessage());
		}catch(InputMismatchException ex) {
			System.out.println("invalid request: "  + ex.getMessage());
		}

		sc.close();
	}

}
