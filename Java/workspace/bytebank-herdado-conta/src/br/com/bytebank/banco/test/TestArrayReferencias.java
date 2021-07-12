package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		System.out.println(contas[0]);
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);		
		contas[0] = cc1;
		System.out.println(contas[0]);
		
		contas[1] = cc2;
		System.out.println(contas[1].getNumero());
				
	}
}
