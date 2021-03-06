import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {
	
	 public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole??es do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com Array List", 15));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando uma cole??o", 25));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Alan Cesar", 5617);
		Aluno a3 = new Aluno("William Jonathan", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println("O aluno " + a1 +  " est? matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, est? matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 ? equals ao turini");
		System.out.println(a1.equals(turini));
		
		System.out.println(a1.hashCode() == turini.hashCode());
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		Aluno depoisDoUltimo = iterador.next();
		
		Vector<Aluno> vetor = new Vector<>();
		
	}

}
