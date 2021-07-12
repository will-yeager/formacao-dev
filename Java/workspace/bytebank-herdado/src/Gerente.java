
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticaUtil util;
	
	public Gerente() {
		this.util = new AutenticaUtil();
		}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}
}