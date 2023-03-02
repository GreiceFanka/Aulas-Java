package polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(90);
		Feijao ing1 = new Feijao(0.1);
		Arroz ing2 = new Arroz(0.1);
		Sorvete sobremesa = new Sorvete(0.4);
		
		p1.comer(ing2);
		p1.comer(ing1);
		p1.comer(sobremesa);
		
		System.out.println(p1.getPeso());
		
	}
}
