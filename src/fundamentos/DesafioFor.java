package fundamentos;

public class DesafioFor {
	public static void main(String[] args) {
		for(String chave = "#";!chave.contains("######") ; chave += "#") {
			System.out.println(chave);
		}
	}
}
