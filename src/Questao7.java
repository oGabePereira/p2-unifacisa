package src;


import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int soma = 0;
		int num = 0;
		int cont = 0;
		
		while(num != 100) {
			num = teclado.nextInt();
			if(num % 2 == 0) {
				cont++;
				soma += num;
			}
		}
		teclado.close();
		
		double media = (double)soma / cont;
		
		System.out.println(media);
	}
}
 