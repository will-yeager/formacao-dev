package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

//br.com.bytebank.banco.test.TestaConta
public class TestaConta {

	//java.lang.String
	public static void main(String[] args) {
		//Full Qualified Name FQN
		//br.com.bytebank.banco.modelo.Conta
		Conta conta = new ContaCorrente(123, 231);
		
		conta.deposita(100.0);
		try {
		conta.saca(200.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Exception -> " + ex.getMessage());
		    ex.printStackTrace();
		}
		System.out.println(conta.getSaldo());
	}
}
