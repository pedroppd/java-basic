package course;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
			System.out.printf("vetor: %.2f", vect[i]);
		}

	}

}
