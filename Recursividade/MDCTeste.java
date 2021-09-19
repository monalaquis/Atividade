package Recursividade;

import java.util.Scanner;

public class MDCTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o dividendo: ");
		double a = sc.nextDouble();
		System.out.println("Informe o divisor: ");
		double b = sc.nextDouble();
		MDC calculo = new MDC();
		
		System.out.printf("O resultado eh %.0f", calculo.mdc(a, b));
		
		sc.close();
		
	}

}
