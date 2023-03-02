package fundamentos;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vezes = 0;
		double nota = 0;
		double total = 0;
	
			while(nota != -1) {
				System.out.print("Digite uma nota ou -1 para sair ");
				nota = entrada.nextDouble();
				if(nota >= 0 && nota <=10) {
					total += nota;
					vezes ++;
				}else if (nota != -1){
					System.out.println("Informe uma nota válida");
				}
			}
			double media = total / vezes;
			System.out.println("A média é " + media);
			System.out.println("A quatidade de notas digitadas foi " + vezes);

		entrada.close();
	}
}
