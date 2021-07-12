
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente william = new Cliente();
		william.nome = "William Jonathan";
		william.cpf = "222.222.222-22";
		william.profissao = "desenvolvedor";
		
		Conta contaDoWilliam = new Conta();
		contaDoWilliam.deposita(100);
		
		contaDoWilliam.titular = william;
		System.out.println(contaDoWilliam.titular.nome);
		System.out.println(contaDoWilliam.titular);
		System.out.println(william);
	}
}
