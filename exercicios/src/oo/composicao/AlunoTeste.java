package oo.composicao;

public class AlunoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Erika");
		Aluno aluno2 = new Aluno("Luciano");
		Aluno aluno3 = new Aluno("cassio");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Ingles");
		Curso curso3 = new Curso("COBOL");
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno3);
		
		curso3.adicionarAluno(aluno3);
		curso3.adicionarAluno(aluno2);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso "+curso3.nome+"...");
			System.out.println("...e o meu nome é "+aluno.nome);
			System.out.println("");
		}
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso "+curso1.nome+"...");
			System.out.println("...e o meu nome é "+aluno.nome);
			System.out.println("");
		}
		
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado no curso "+curso2.nome+"...");
			System.out.println("...e o meu nome é "+aluno.nome);
			System.out.println("");
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		System.out.println(aluno2.cursos.get(0).alunos);
		System.out.println(aluno3.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Ingles");
		
		if (cursoEncontrado != null) {
			System.out.println("Curso = "+cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
		
	}

}
