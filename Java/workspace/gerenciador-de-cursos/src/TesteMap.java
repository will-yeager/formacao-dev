import java.util.*;
import java.util.Map.Entry;

public class TesteMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        System.out.println(nomesParaIdade.keySet());
        Set<String> chaves = nomesParaIdade.keySet();
        for(String nome : chaves) {
        	System.out.println(nome);
        }
        
        Collection<Integer> values = nomesParaIdade.values();
        for(Integer value : values) {
        	System.out.println(value);
        }
        
        Set<Entry<String, Integer>> teste = nomesParaIdade.entrySet();
        for(Entry<String, Integer> association : teste) {
        	System.out.println(association.getKey() + " + " + association.getValue());
        }
    }
}