package src;


import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int contador = 0;
		
		for (int i = 0; i < 25; i++) {
			int num = teclado.nextInt();
			if(num % 2 == 0 && num >= 0) {
				contador++;
			}
		}
		teclado.close();
		System.out.println(contador);
	}
}
 