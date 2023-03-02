package fundamentos;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro valor ");
		double valor1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo valor ");
		double valor2 = entrada.nextDouble();
		
		double resultado = valor1 + valor2;
		
		System.out.println(resultado);
		
		entrada.close();
	}
}
