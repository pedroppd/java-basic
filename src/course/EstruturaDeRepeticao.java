package course;

import java.util.Scanner;

public class EstruturaDeRepeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numberOne = sc.nextInt();

		while (numberOne <= 0) {
			System.out.println("O número não pode ser negativo, tente denovo: ");
			numberOne = sc.nextInt();
		}

		System.out.println("Digite quantos números você quer comparar: ");
		int numberComparer = sc.nextInt();

		int total = 0;
		int sum = 0;
		for (int cont = 1; cont <= numberComparer; cont++) {
			System.out.println("Digite um número");
			total = sc.nextInt();
			sum = sum += total;
		}
		System.out.println("Soma é: " + sum);

		System.out.println("----Raiz quadrada----");

		char reply;
		do {
			System.out.println("Digite um número: ");
			int number = sc.nextInt();
			double rq = Math.sqrt(number);
			System.out.printf("A raíz quadrada de é %.2f: ", rq);
			System.out.print("Deseja continuar ? [s/n]");
			reply = sc.next().charAt(0);

		} while (reply != 'n');
	}

}
