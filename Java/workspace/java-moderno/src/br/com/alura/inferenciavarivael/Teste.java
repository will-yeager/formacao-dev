package br.com.alura.inferenciavarivael;

import java.util.HashMap;

public class Teste {

	// Novidade do Java 10 - Interferencia de vari�vel
	public static void main(String[] args) {
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("Jo�o", "04813189");

		System.out.println(cpfPorNomes);
	}
}
