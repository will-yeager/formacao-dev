package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		//Array []
		
		int[] idades = new int[5];// inicializa o array com 0
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			System.out.println(idades[i]);
		}
	}
}
