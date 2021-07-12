import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Desafio {

	public static void main(String[] args) {
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
//		letras.forEach(letra -> {
//			System.out.println(letra);
//		});

		Iterator<String> iterador = letras.iterator();
		while(iterador.hasNext()) {
			String letra = iterador.next();
			System.out.println(letra);
		}
	}

}
