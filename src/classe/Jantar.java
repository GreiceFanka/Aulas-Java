package classe;
//mostrar peso da pessoa antes de comer e depois de comer
public class Jantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Carbonara",0.200);
		Comida c2 = new Comida("Lasanha", 0.300);
		
		Pessoa p1 = new Pessoa("Joao", 88.0);
		Pessoa p2 = new Pessoa("Maria", 65.3);
		
		System.out.println("Peso antes de comer do(a) " + p1.nome +" é "+ p1.peso);
		System.out.println("Peso antes de comer do(a) " + p2.nome +" é "+ p2.peso);
		
		double resul1 = p1.comer(c1.pesoComida);
		System.out.println("O peso depois de comer do(a) " + p1.nome + " é " + resul1);
		
		double resul2 = p2.comer(c2.pesoComida);
		System.out.println("O peso depois de comer do(a) " + p2.nome + " é " + resul2);
		
		
	}
}
