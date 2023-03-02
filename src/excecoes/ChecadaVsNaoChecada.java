package excecoes;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}
	//Excecao nao checada ou nao verificada nao e obrigatorio o tratamento do erro 
	static void geraErro1(){
		throw new RuntimeException("Ocorreu um erro legal#01");
	}
	// Excecao verificada ou checada, tratar o erro e obrigatorio, deve-se usar o throws na assinatura do metodo
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro legal#02");
	}
}
