package fundamentos;

import java.util.Scanner;

public class DesafioCalculadoraSemIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro número ");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo número ");
		int num2 = entrada.nextInt();
		System.out.println("Digite a operação desejada ");
		String operacao = entrada.next();
		
		double resultado = operacao.equals("-")? num1 - num2 : 0;
		resultado = operacao.equals("+")? num1 + num2 : resultado;
		resultado = operacao.equals("*")? num1 * num2 : resultado;
		resultado = operacao.equals("/")? num1 / num2 : resultado;
		resultado = operacao.equals("%")? num1 % num2 : resultado;
		
		System.out.println("O resultado da operação é " + resultado);
		
	
		entrada.close();
	}
}

