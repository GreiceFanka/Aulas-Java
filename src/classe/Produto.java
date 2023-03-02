package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeP, double precoP){
		nome = nomeP;
		preco = precoP;
	}
	
	double calculoProdutoDesconto(){
		return preco * (1-desconto);
	}
	double calculoDescontoNatal() {
		desconto = 0.35;
		return preco * (1 - desconto);
	}
}
