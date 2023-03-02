package faculdade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PensarResponder {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		int nums = -1;
			while(nums != 0) {
				System.out.println("Digite um numero ou 0 para sair");
				nums = entrada.nextInt();
				lista.add(nums);
			}
		Iterator<Integer> numeros = lista.iterator();
		System.out.println("Os numeros armazenados foram " );
			while(numeros.hasNext()) {
				System.out.println(numeros.next());
			}
		int soma = lista.stream().mapToInt(Integer::valueOf).sum();
		System.out.printf("A soma dos números digitados é %d",soma);
		entrada.close();
	}
}