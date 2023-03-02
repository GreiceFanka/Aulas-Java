package heranca;

public class Carro {
	protected int velocidadeAtual;
	public final int VELOCIDADE_MAXIMA;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public int acelerar() {
		if(velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
			return velocidadeAtual;
		}else {
			velocidadeAtual += 5;
			return velocidadeAtual;
		}
	}
	
	public int frear() {
		if(velocidadeAtual > 0) {
			velocidadeAtual -= 5;
		}
		return velocidadeAtual;
	}
}
