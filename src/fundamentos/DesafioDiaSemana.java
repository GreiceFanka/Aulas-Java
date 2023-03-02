package fundamentos;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana: ");
		String dia = entrada.next();
		
		if (dia.equalsIgnoreCase("segunda")) {
			int diaNum = 2;
			System.out.println("O dia da semana é equivalente a " + diaNum);
		}else if(dia.equalsIgnoreCase("terça")) {
			int diaNum = 3;
			System.out.println("O dia da semana é equivalente a " + diaNum);
		}else if(dia.equalsIgnoreCase("quarta")) {
			int diaNum = 4;
			System.out.println("O dia da semana é equivalente a " + diaNum);
		}else if(dia.equalsIgnoreCase("quinta")) {
			int diaNum = 5;
			System.out.println("O dia da semana é equivalente a " + diaNum);
		}else if(dia.equalsIgnoreCase("sexta")) {
			int diaNum = 6;
			System.out.println("O dia da semana é equivalente a " + diaNum);
		}else if(dia.equalsIgnoreCase("sabado")) {
			int diaNum = 7;
			System.out.println("O dia da semana é equivalente a " + diaNum);
		}else if(dia.equalsIgnoreCase("domingo")) {
			int diaNum = 1;
			System.out.println("O dia da semana é equivalente a " + diaNum);
		}else {
			System.out.println("O dia da semana é inválido");
		}
		entrada.close();
	}
}
