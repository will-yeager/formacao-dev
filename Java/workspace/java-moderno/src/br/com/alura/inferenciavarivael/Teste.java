package br.com.alura.inferenciavarivael;

import java.util.HashMap;

public class Teste {

	// Novidade do Java 10 - Interferencia de variável
	public static void main(String[] args) {
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("João", "04813189");

		System.out.println(cpfPorNomes);
	}
}
