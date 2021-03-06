import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaString {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		Comparator<String> comparador = new ComparatorPorTamanho();
		// Collections.sort(palavras, comparador);
		System.out.println(palavras);
		
		palavras.sort( (String s1, String s2) -> { 
			if(s1.length() < s2.length())
				return -1;
			if(s1.length() > s2.length())
				return 1;
			return 0; 
		});
		
		palavras.sort( (s1, s2) -> Integer.compare((s1.length()), s2.length()));;
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		palavras.sort(Comparator.comparing(String::length));
		
		Function<String, Integer> funcao = s -> s.length();
		
		Comparator<String> comparador1 = Comparator.comparing(funcao );
		
		Consumer<String> impressor = System.out::println;
		
		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		}
		);
		
		palavras.forEach( palavra -> System.out.println(palavra) );
		
		
		palavras.forEach( (s) -> System.out.println(s) );
		
		new Thread(() ->
		System.out.println("Executando um Runnable")).start();
	}
}


class ComparatorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() < o2.length()) {
			return -1;
		}
		if(o1.length() > o2.length()) {
			return 1;
		}
		return 0;
	}
	
}