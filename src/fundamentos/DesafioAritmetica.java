package fundamentos;

public class DesafioAritmetica {
	public static void main(String[] args) {
		//Primeiro Bloco
		
		int soma = 3 + 2;
		int multiplicacao = 6 * soma;
		double potencia = Math.pow(multiplicacao, 2);
		int multi2 = 3 * 2;
		double divisao = potencia / multi2;
		//System.out.println(divisao);
		
		
		//Segundo bloco
		
		int subtracaoA = 1 - 5;
		int subtracaoB = 2 - 7;
		int multiplicacao3 = subtracaoA * subtracaoB;
		int divisaoB = multiplicacao3 / 2;
		double potencia2 = Math.pow(divisaoB,2);
		//System.out.println(potencia2);
		
		//Subtracao dos dois blocos e resultado
		double subtracaoC = divisao - potencia2;
		double potencia3 = Math.pow(subtracaoC,3);
		//System.out.println(subtracaoC);
		double potencia4 = Math.pow(10,3);
		//System.out.println(potencia4);
		
		double resultado = potencia3 / potencia4;
		int result = (int) resultado;
		
		System.out.println(result);
		
	}

}
