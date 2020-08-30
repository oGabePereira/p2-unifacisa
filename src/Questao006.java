package src;
import java.util.Scanner;

public class Questao006 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i = 0; i < 5; i++) {
			int num = teclado.nextInt();
			if(num % 3 == 0) {
				soma += num;
			}
		}
		teclado.close();
		System.out.println(soma);
	}
}
 