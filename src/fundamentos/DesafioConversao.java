package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro salário: ");
		String salario1 = entrada.nextLine().replaceAll(",", ".");
		double value1 = Double.parseDouble(salario1);
		
		System.out.print("Digite seu segundo salário: ");
		String salario2 = entrada.nextLine().replaceAll(",", ".");
		double value2 = Double.parseDouble(salario2);
		
		System.out.print("Digite seu terceiro salário: ");
		String salario3 = entrada.nextLine().replaceAll(",", ".");
		double value3 = Double.parseDouble(salario3);
		
		double media = (value1 + value2 + value3) /3;
		
		System.out.println("A média dos salarios é " + media);
		
		entrada.close();
	}

}
