package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	//construtor explicito
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	//construtor implicito que foi perdido ao declarar construtor explicito
	Data(){
		//dia = 02;
		//mes = 01;
		//ano = 1970;
		this(01,01,1970); //so pode ser usado em um construtor para chamar outro construtor.
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
