
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaAnna = new Conta();
		
		contaDaAnna.titular = new Cliente();
		System.out.println(contaDaAnna.titular);
		
		contaDaAnna.titular.nome = "Anna";
		System.out.println(contaDaAnna.titular.nome);
	}
}
