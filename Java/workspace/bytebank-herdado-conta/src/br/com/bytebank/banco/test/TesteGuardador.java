package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeConta;

public class TesteGuardador {
	
	public static void main(String[] args) {
		
		GuardadorDeConta guardador = new GuardadorDeConta();
		ContaPoupanca cp = new ContaPoupanca(22, 11);
		String x = "Will";
		guardador.adiciona(x);
		
        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);
		guardador.adiciona(cp);
		System.out.println(guardador.getQuantidadeDeContas());
		
		System.out.println(guardador.getReferencia(0));
	}


}
