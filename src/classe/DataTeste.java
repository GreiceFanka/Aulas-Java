package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data(27,01,2023);
		
		Data d2 = new Data();
		
		String resultado = d1.obterDataFormatada();
		String resultadoSegundaData = d2.obterDataFormatada();
		
		System.out.println("Hoje é dia: " + resultado);
		System.out.println("A data de inicialização é " + resultadoSegundaData );
	}

}