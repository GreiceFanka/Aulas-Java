package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
	
		usuarios.put(1, "Mariana"); // metodo para adicionar e diferente pois quando os valores sao
		//iguais ele substitui o valor antigo pelo novo valor
		usuarios.put(2, "Paulo");
		usuarios.put(3, "Juliana");
		usuarios.put(5, "Daniela");
		usuarios.put(2, "Matheus");

		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
	}
}
