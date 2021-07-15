import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		Comparator<String> comparador = new ComparatorPorTamanho();
		Collections.sort(palavras, comparador);
		System.out.println(palavras);
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