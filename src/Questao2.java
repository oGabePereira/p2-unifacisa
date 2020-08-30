package src;


import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num1 = teclado.nextDouble();
		double num2 = teclado.nextDouble();
		double num3 = teclado.nextDouble();
		
		double media = (num1 + num2 + num3) / 3;
		
		System.out.println(media);
		teclado.close();
	}
}
