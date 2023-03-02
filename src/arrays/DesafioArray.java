package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite quantas notas deseja informar ");
		int quantidadeNotas = entrada.nextInt();
		
		double [] notas = new double [quantidadeNotas];

		for(int i=0;i<quantidadeNotas;i++) {
			System.out.println("Digite a nota ");
			double nota = entrada.nextDouble();
			notas[i] = nota;
		}
		//System.out.print(Arrays.toString(notas));
		double soma = 0;
		for (double nota:notas) {
			soma += nota;
		}
		double resultado = soma / quantidadeNotas;
		System.out.println("A média das notas do aluno foi " + resultado);
		entrada.close();
	}
}
