
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(10, 10);
		conta.setNumero(1337);
		
		System.out.println(conta.getNumero());
		Cliente william = new Cliente();
		william.setNome("William Jonathan");
		conta.setTitular(william);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Desenvolvedor");
		System.out.println(william.getNome());
		System.out.println(conta.getTitular().getProfissao());
	}
}
