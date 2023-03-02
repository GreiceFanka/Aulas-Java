package classe;
//nome,peso
//metodo comer peso da comida deve ser acrescentado ao peso da pessoa
public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	double comer(double pesoComida){
		double calculoPeso = peso + pesoComida;
		return calculoPeso;
	}
}
