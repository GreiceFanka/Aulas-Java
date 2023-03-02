package faculdade;

public class PensarResponderFinal {
	public int calculo() {
		try {
			int a = 0;
			int b = 0;
			
			return a / b;

		 }catch (ArithmeticException e) {

			return 0;

		} catch (RuntimeException e) {

			 return -1;

		} finally {

		 System.out.print("concluído");

		 }	
	}

}
