package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook",3100.80);
		
		var p2 = new Produto("Caneta", 12.34);
		
		double calculo = p1.calculoProdutoDesconto();
		double calculo2 = p2.calculoProdutoDesconto();
		
		double calculoNatal = p1.calculoDescontoNatal();
		System.out.println(calculo);
		System.out.println(calculo2);
		System.out.printf("O valor com desconto de natal é de %.2f" ,calculoNatal);
		
		
	}
}
