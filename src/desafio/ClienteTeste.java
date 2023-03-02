package desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Caneta",3.50);
		Produto p2 = new Produto("Mesa",300);
		Produto p3 = new Produto("Toalha",22.50);
		Produto p4 = new Produto("Bloco de papel", 4.85);
		
	
		Compra c1 = new Compra();
		Compra c2 = new Compra();
		Compra c3 = new Compra();
		Compra c4 = new Compra();
		
		c1.adicionarItem(p4, 3);
		c2.adicionarItem(p1, 5);
		c3.adicionarItem(p2, 2);
		c4.adicionarItem(p3, 8);
		
		
		Cliente cliente1 = new Cliente("Maria");
		Cliente cliente2 = new Cliente("Thiago");
		
		
		cliente1.adicionarCompra(c1);
		cliente2.adicionarCompra(c2);
		cliente2.adicionarCompra(c3);
		cliente2.adicionarCompra(c4);
		
		
		System.out.println("O cliente " + cliente1.nome + " gastou " + "RS " +cliente1.obterValorTotal());
		System.out.println("O cliente " + cliente2.nome + " gastou " + "RS " +cliente2.obterValorTotal());
		
		
		
	}

}
