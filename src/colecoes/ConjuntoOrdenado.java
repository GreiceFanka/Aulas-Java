package colecoes;

//import java.util.HashSet;
//import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrdenado {
	public static void main(String[] args) {
		//Set<String> listaAprovados = new HashSet<>();//Nao tem nenhuma ordenacao, 
		//nao possui index, os dados podem ser heterogeneos apesar de nao ser uma boa pratica
		//Nao aceita objetos duplicados
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Marcos");
		listaAprovados.add("Patricia");
		listaAprovados.add("Carlos");
		
		for(String candidato:listaAprovados) {
			System.out.println(candidato);
		}
	}
}
