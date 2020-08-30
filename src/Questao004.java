package src;
import java.util.Scanner;

public class Questao004 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int contador = 0;
		int vmin = teclado.nextInt();
		int vmax = teclado.nextInt();
		
		for (int i = vmin + 1; i < vmax; i++) {
			if(i % 4 == 0) {
				contador++;
			}
		}
		teclado.close();
		System.out.println(contador);
	}
}
 