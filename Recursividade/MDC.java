package Recursividade;

public class MDC {

	public double mdc(double dividendo, double divisor) {
		if (divisor == 0)
			return dividendo;
		else
			return mdc(divisor, (dividendo % divisor));
	}

}
