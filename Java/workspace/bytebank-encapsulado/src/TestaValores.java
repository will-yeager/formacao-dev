
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(10, 100);
		
		System.out.println(conta.getNumero());
	
		conta.setAgencia(-50);
		conta.setNumero(-330);
		
		Conta conta1 = new Conta(1012, 100);
		Conta conta2 = new Conta(120, 100);
		System.out.println(Conta.getTotal());
	}
}
