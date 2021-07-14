package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		System.out.println(referencias[0]);
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);		
		referencias[0] = cc1;
		System.out.println(referencias[0]);
		
		referencias[1] = cc2;
		System.out.println(((Conta) referencias[1]).getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		System.out.println(ref);
				
	}
}
