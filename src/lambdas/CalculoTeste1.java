package lambdas;

public class CalculoTeste1 {
	 public static void main(String[] args) {
		Calculo calculo1 = new Somar();
		Calculo calculo2 = new Multiplicar();
		
		System.out.println(calculo1.executar(5,3));
		System.out.println(calculo2.executar(2, 2));
	}
}
