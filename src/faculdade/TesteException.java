package faculdade;

public class TesteException {
	
	public static void main(String[] args) throws ArithmeticException {
		int a = 0;
		int b = 0;
		try {
	       System.out.println(a / b);

		 } catch (RuntimeException e) {
			 System.out.println(-1);
		 } finally {

			 System.out.println("Concluido");

		}
	};
}
