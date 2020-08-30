package src;
import java.util.Scanner;

public class Questao001 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double num1 = teclado.nextDouble();
		double num2 = teclado.nextDouble();
		
		if(num1 > num2) 
		{
			System.out.println(num1);
		}
		else 
		{
			System.out.println(num2);
		}
		teclado.close();
	}
}