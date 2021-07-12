import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("William");
		alunos.add("Anna");
		alunos.add("Paloma");
		alunos.add("Paulo");
		
		System.out.println(alunos.size());
		
		alunos.add("William");
		
		System.out.println(alunos);
		
		System.out.println(alunos.size());


		for(String aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
