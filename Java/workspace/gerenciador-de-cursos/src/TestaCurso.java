import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Java Collections", "William Jonathan");
		javaColecoes.adiciona(new Aula("ArrayList", 20));
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(aulas);
	}
}
