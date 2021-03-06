package br.com.alura.factorymethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {
	
	public static void main(String[] args) {
	
		// Novidade do Java 9 - Factory Method para Collection
		List<String> nome = List.of("primeiroNome", "segundoNome"); // Immutable List
		Set.of("terceiroNome");
		Map.of("nome", "Jo?o");
		
		System.out.println(nome);
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);
	}
}
