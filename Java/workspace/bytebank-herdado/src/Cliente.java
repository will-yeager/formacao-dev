
public class Cliente implements Autenticavel {

	private AutenticaUtil util;
	
	public Cliente() {
		this.util = new AutenticaUtil();
	}
	
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}


}
