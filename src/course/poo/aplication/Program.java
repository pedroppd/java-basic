package course.poo.aplication;

import java.util.Locale;
import java.util.Scanner;

import course.poo.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto(sc.nextLine(), sc.nextDouble(), sc.nextInt());
		
		System.out.println(produto.toString());
		System.out.println("Total: " + produto.totalValueInStock());
		
		System.out.println("Insira uma quantidade pra ser adicionado no estoque");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		System.out.println("Produto: " + produto.toString());
	
		System.out.println("Total: " + produto.totalValueInStock());
		
		System.out.println("Insira uma quantidade pra ser removida no estoque");
		int remove = sc.nextInt();
		produto.removeProducts(remove);
		
		System.out.println("Produto: " + produto.toString());
		
		System.out.println("Total: " + produto.totalValueInStock());
		
		
	}

}
