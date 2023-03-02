package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {

		double d = 1; //Conversao Implícita
		System.out.println(d);
		
		float f = (float) 1.12345678889865;
		System.out.println(f); //Conversao Explícita CAST
	}
}
