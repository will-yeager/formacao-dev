package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {


	public ContaEspecial(int agencia, int saldo) {
		super(agencia, saldo);
;	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
