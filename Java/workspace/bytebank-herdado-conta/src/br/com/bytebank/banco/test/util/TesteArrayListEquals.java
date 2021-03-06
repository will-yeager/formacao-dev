package br.com.bytebank.banco.test.util;

import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {
		
		List<Conta> lista = new Vector<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		
		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cc3);
		
		System.out.println("J? existe? " + existe);
		
		for(Conta conta : lista) {
			if(conta.equals(cc3)) {
				System.out.println("J? tenho essa referencia!");
			}
		}
		
		for(Conta o : lista) {
			System.out.println(o);
		}
	}
}
