package colecoes;

public class CursoTeste {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Eduardo");
		
		Curso curso1 = new Curso("Java completo");
		Curso curso2 = new Curso("PHP completo");
		Curso curso3 = new Curso("Web completo 2023");
		
		curso1.adicionarAluno(aluno3);
		curso1.adicionarAluno(aluno1);
		
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno1);
		
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso " + curso1.nome );
			System.out.println("e meu nome é " + aluno.nome);
		}
	}

}
