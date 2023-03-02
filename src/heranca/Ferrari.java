package heranca;

public class Ferrari extends Carro {
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
	}

	public int acelerar() {
		if(velocidadeAtual + 15 > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
			return velocidadeAtual;
		}else {
			velocidadeAtual += 15;
			return velocidadeAtual;
		}
	}
	
	public int frear() {
		if(velocidadeAtual > 0) {
			velocidadeAtual -= 15;
		}
		return velocidadeAtual;
	}
}
