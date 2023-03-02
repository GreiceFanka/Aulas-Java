package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//tipos numericos
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipos booleanos
		boolean estaDeFerias = false;
		
		//tipo caractere
		char status = 'A';
		
		//dias de empresa
		System.out.println(anosDeEmpresa *365);
		//num de viagens
		System.out.println(numerosDeVoos / 2);
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		//Quanto ganha
		System.out.println("O funcionario com ID "+ id + " Recebe o salario de " + salario);
		System.out.println("Esta de ferias? " + estaDeFerias);
		System.out.println("Status " + status);
		
	}
}
