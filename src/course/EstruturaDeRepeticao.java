package course;

import java.util.Scanner;

public class EstruturaDeRepeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int numberOne = sc.nextInt();
		
		while(numberOne<=0) {
			System.out.println("O n�mero n�o pode ser negativo, tente denovo: ");
			numberOne = sc.nextInt();
		}

		System.out.println("Digite quantos n�meros voc� quer comparar: ");
		int numberComparer = sc.nextInt();
		
		int total = 0;
		int sum = 0;
		for(int cont=1; cont<=numberComparer; cont++) {
			System.out.println("Digite um n�mero");
			total = sc.nextInt();
			sum = sum += total;
		}
		System.out.println("Soma �: "+ sum);
		
	}

}
