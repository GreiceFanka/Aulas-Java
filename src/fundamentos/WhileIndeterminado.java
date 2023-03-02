package fundamentos;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palavra ="";
		
		while(!palavra.equalsIgnoreCase("sair")) {
			System.out.println("Digite alguma palavra ");
			palavra = entrada.nextLine();
		}
		entrada.close();
	}
}
