package src;
import java.util.Scanner;

public class Questao003 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome = teclado.next();
		double preco = teclado.nextDouble();
		double desconto = 0;
		
		if (preco > 0 && preco < 100) {
			desconto = 0.05;
		}
		else if(preco < 500) {
			desconto = 0.10;
		}
		else if (preco >= 500) {
			desconto = 0.15;
		}
		System.out.println("Produto: " + nome + " Valor: R$ " + (preco -= preco * desconto));
		teclado.close();
	}
}
