package fundamentos;

public class DesafioLogico {
	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		if(trabalho1 && trabalho2) {
			boolean sorvete = true;
			boolean saudavel = false;
			System.out.println("Vamos comer sorvete? " + sorvete);
			System.out.println("Ficamos mais saudáveis? " + saudavel);
			System.out.println("Vamos comprar uma TV de 50 Polegadas");
		}else {
			boolean sorvete = false;
			boolean saudavel = true;
			System.out.println("Vamos comer sorvete? " + sorvete);
			System.out.println("Ficamos mais saudáveis? " + saudavel);
			System.out.println("Vamos comprar somente uma TV de 32 polegadas");
		}
		
	}
}
