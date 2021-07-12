
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticaUtil util;
	
	public Administrador() {
		this.util = new AutenticaUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}
	
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}

}