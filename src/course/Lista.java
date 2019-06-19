package course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.addAll(Arrays.asList("Pedro", "Márcio", "Marcos", "Maria", "Neymar", "Júnior", "Mariana", "Amaral",
				"Gabriella", "Carolina"));

		System.out.println("Index of marcos: " + list.indexOf("marcos")); // find the position in list

		System.out.println("----------------------------------------------------------");

		// filter all names with an condition
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

		for (String f : result) {
			System.out.println("Nome: " + f);
		}

		System.out.println("----------------------------------------------------------");

		for (String nome : list) {
			System.out.println("Nome: " + nome);
		}

		list.add(5, "*Pedro dantas"); // do you choice an position for insert a name

		System.out.println("---------------------------------------------------");

		for (String nome : list) {
			System.out.println("Nome: " + nome);
		}

		list.removeIf(x -> x.charAt(0) == 'M'); // remove a element of list with an condition

		System.out.println("---------------------------------------------------");

		for (String nome : list) {
			System.out.println("Nome: " + nome);
		}

	}

}
