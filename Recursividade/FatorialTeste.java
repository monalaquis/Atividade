package Recursividade;

import java.util.Scanner;

public class FatorialTeste {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Fatorial fat = new Fatorial();
		System.out.println("Informe o numero: ");
		int num = sc.nextInt();
		int a = fat.fatorialRecursivo(num);

		
			System.out.printf("%d! = %d", num, a);
		
			sc.close();
	}
}
