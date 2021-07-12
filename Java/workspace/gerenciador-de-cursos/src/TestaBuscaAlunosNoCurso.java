import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {
		
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
			
		javaColecoes.adiciona(new Aula("Trabalhando com Array List", 15));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando uma coleção", 25));
			
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Alan Cesar", 5617);
		Aluno a3 = new Aluno("William Jonathan", 17645);
		Aluno a4 = new Aluno("Paulo Silveira", 5617);
			
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);

		System.out.println(javaColecoes.getAlunos());
		System.out.println("Quem é o aluno com matricula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("aluno : " + aluno);
		
		Map<Integer, Set<Aluno>> matriculaParaAlunos = new LinkedHashMap<>();
	}

}

