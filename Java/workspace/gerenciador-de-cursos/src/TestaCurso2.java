import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Java Collections", "William Jonathan");
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		Aula aula = new Aula("Array List", 20);
		Aula aula2 = new Aula("Linked List", 9);
		
		javaColecoes.adiciona(aula);
		javaColecoes.adiciona(aula2);
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		System.out.println(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}
}
