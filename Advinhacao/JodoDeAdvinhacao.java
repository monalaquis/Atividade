package Advinhacao;

import java.util.Scanner;

public class JodoDeAdvinhacao {
	private int valor;

	public JodoDeAdvinhacao(int valor) {
		this.valor = valor;
	}

	public void jogar() {
		final int tentativas = 20;
		int cont = 1;
		int tentativaAtual;

		Scanner sc = new Scanner(System.in);
		System.out.printf("Advinha o numero secreto em %d tentativas:\n", tentativas);

		do {
			
			System.out.printf("Tentativa numero |%d|\n", cont);
			tentativaAtual = sc.nextInt();
			if (tentativaAtual == this.valor) {
				System.out.println("Acertou");
				return;
			} else if (tentativaAtual < this.valor) {
				System.out.printf("O numero |%d| é menor que numero secreto!\n", tentativaAtual);
			} else {
				System.out.printf("O numero |%d|é maior que o numero secreto!\n", tentativaAtual);
			}
			cont++;
		} while (cont <= tentativas);

		System.out.println("Excedeu");

		sc.close();
	}
	
}
