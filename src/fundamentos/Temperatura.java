package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double fahrenheit = 86;
		final int menos = 32;
		final double divisao = 5.0/9;
		double celsius = (fahrenheit - menos) * divisao;
		System.out.println("O resultado em grau celsius é " + celsius);
	}

}
