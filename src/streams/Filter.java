package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana",7.8, 100);
		Aluno a2 = new Aluno("Pedro",6.5,35);
		Aluno a3 = new Aluno("Miguel",8.3,70);
		Aluno a4 = new Aluno("Mariana",4.7,20);
		Aluno a5 = new Aluno("Guilherme",9.8,90);
		Aluno a6 = new Aluno("Luiza",7.5,100);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		Predicate<Aluno> frequenciaMinima = a -> a.frequencia >= 60;
		Predicate<Aluno> notaMinima = a -> a.nota >= 7;
		
		alunos.stream()
		.filter(frequenciaMinima)
		.filter(notaMinima)
		.map(a -> "Parabens " + a.nome + " Voce esta aprovado!")
		.forEach(System.out::println);
	}

}
