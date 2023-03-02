package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número ");
		String num1 = entrada.next().replaceAll(",", ".");
		double value1 = Double.parseDouble(num1);
		
		System.out.println("Digite o segundo número ");
		String num2 = entrada.next().replaceAll(",", ".");
		double value2 = Double.parseDouble(num2);
		
		System.out.println("Digite a operação desejada - + * / %");
		String operacao = entrada.next();
		
		if (operacao.equals("-")) {
			double result = value1 - value2;
			System.out.println("O resultado do cálculo é " + result);
		}else if(operacao.equals("+")){
			double result = value1 + value2;
			System.out.println("O resultado do cálculo é " + result);
		}else if (operacao.equals("*")) {
			double result = value1 * value2;
			System.out.println("O resultado do cálculo é " + result);
		}else if (operacao.equals("/")) {
			double result = value1 / value2;
			System.out.println("O resultado do cálculo é " + result);
		}else {
			System.out.println("Qual o módulo deseja calcular? ");
			int modulo = entrada.nextInt();
			double result = value1 * modulo;
			double result2 = value2 * modulo;
			System.out.println("O primeiro número teve o resultado do módulo igual a " + result);
			System.out.println("O primeiro número teve o resultado do módulo igual a " + result2);
	
		}
	
		entrada.close();
	}
}
