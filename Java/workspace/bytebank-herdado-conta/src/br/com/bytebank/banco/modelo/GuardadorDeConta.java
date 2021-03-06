package br.com.bytebank.banco.modelo;

public class GuardadorDeConta {

	private Object[] referencias;
	private int quantidadeDeContas;
	
	public GuardadorDeConta() {
		this.referencias = new Object[5];
		this.quantidadeDeContas = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[quantidadeDeContas] = ref;
		this.quantidadeDeContas++;
	}
	
	public int getQuantidadeDeContas() {
		return quantidadeDeContas;
	}
	
	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
}
