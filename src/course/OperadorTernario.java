package course;

public class OperadorTernario {

	public static void main(String[] args) {
		double preco = 32.2;
		
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.5; 
		
		System.out.println("Desconto: " + desconto);
	}

}
