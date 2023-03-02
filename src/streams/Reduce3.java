package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana",7.8, 100);
		Aluno a2 = new Aluno("Pedro",6.5,35);
		Aluno a3 = new Aluno("Miguel",8.3,70);
		Aluno a4 = new Aluno("Mariana",4.7,20);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> notaMinima = a -> a.nota >= 7;
		
		Function<Aluno, Double> apenasNota = a -> a.nota;
		
		BiFunction<Media, Double, Media> calcularMedia = (media,nota) -> media.adicionar(nota);
		
		BinaryOperator<Media> combinarMedia = (m1,m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.stream()
		.filter(notaMinima)
		.map(apenasNota)
		.reduce(new Media(),calcularMedia,combinarMedia);
		
		System.out.println("A media da turma é " + media.getValor());
	}

}
