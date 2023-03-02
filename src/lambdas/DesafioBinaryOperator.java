package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioBinaryOperator {
	public static void main(String[] args) {
		
		Produto p = new Produto("Ipad", 3235.39, 0.13);
		
		Function<Produto,Double> desconto = produto -> produto.preco * (1 - produto.desconto);
		
		System.out.printf("Valor com desconto R$ %5.2f%n",desconto.apply(p));
		
		UnaryOperator<Double> imposto = valor -> valor >= 2500 ? valor * (1 - 0.085) : valor;
		
		System.out.printf("Valor com desconto e imposto R$ %5.2f%n",desconto
				.andThen(imposto)
				.apply(p));
		
		UnaryOperator<Double> frete = resultado -> resultado >= 3000 ? resultado + 100 : resultado + 50;
		
		System.out.printf("Valor total com frete R$ %5.2f%n",desconto
				.andThen(imposto)
				.andThen(frete)
				.apply(p));
		}
}
