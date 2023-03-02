package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		//Wrappers são classes que permitem converter tipos primitivos em objetos
		Byte b = 100;
		Short s = 1000;
		
		Integer i = 10000; //int
		Long l = 100000L;
		
		Double d = 1234.5678;
		Float f = 123.10F;
		
		Boolean bo = Boolean.parseBoolean("true");
		Character c = '#'; // char
		System.out.println(c + "...");
		
		System.out.println(bo);
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		System.out.println(d);
		System.out.println(f);
	}

}
