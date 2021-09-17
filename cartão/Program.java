package cartão;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		int ano = c.get(Calendar.YEAR);
		int mes = c.get(Calendar.MONTH);
		int anoValidade=0;
		int mesValidade=0;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Informa seu nome:");
		String nome = sc.nextLine();
		System.out.println("Numero:");
		int numero = sc.nextInt();
		System.out.println("Codigo:");
		int codigo = sc.nextInt();

		do{
			
			System.out.println("Ano de validade");
			anoValidade = sc.nextInt();
			if (anoValidade < ano) {
				System.out.println("Ano Invalido");
			}

		}while(anoValidade<mes);
		
		System.out.println("Mes de validade");
		mesValidade = sc.nextInt();

		do {
			
			if(mesValidade<ano) {
				System.out.println("Mes Invaliado");
			}
			System.out.println("Mes da Validade");
			mesValidade = sc.nextInt();1
		}while (anoValidade == ano && mesValidade < mes);
		
		Cartao Ufersacar = new Cartao(nome, numero, codigo, anoValidade, mesValidade);
		System.out.println(Ufersacar);

	}

}
