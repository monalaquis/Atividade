package Recursividade;



public class Potencia {
	int k, n;

	public static int potencia(int k, int n) {
		if (n == 0) {
			return 1;
		} else {

			int aux = potencia(k, n / 2);
			if (n % 2 == 0)
				return aux * aux;
			else
				return aux * aux * k;

		}
	}

	public void imprime(int k, int n) {
		
		
		System.out.printf("Potencia de %d elevado %d eh:%d", k, n, potencia(k,n));
	}
}
