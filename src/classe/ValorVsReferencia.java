package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; //Atribuiçao por valor (tipos primitivos) espaços de memoria separados 
		a++;
		b--;
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1,6,1976);
		Data d2 = d1; // Atribuiçao por referencia (Objetos) compartilham o mesmo endereço de memoria
		
		d1.dia = 30;
		d2.mes = 01;
		d2.ano = 2023;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}

}
