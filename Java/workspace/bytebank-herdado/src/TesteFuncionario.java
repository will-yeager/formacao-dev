
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		Gerente william = new Gerente();
		william.setNome("William Jonathan");
		william.setCpf("222.222.222-2");
		william.setSalario(1200.0);
		
		System.out.println(william.getNome());
		System.out.println(william.getBonificacao());
	}
}
