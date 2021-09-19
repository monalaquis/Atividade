package Recursividade;

import java.util.Scanner;

public class PotenciaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		Potencia pot = new Potencia();
		System.out.println("Informe a base e o expoente:");
		int k = sc.nextInt();
		int n = sc.nextInt();
		
		pot.imprime(k, n);
		sc.close();
	}

}
