package encapsulamento;

import heranca.Civic;
import heranca.Ferrari;

public class DesafioHeranca{

	public static void main(String[] args) {
		Civic c1 = new Civic(150);
		Ferrari f1 = new Ferrari(200);
		
		System.out.println(c1.acelerar());
		System.out.println(f1.acelerar());
		
	}
}
