package bytebank;

public class TestaReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		System.out.println("saldo da segunda conta " + segundaConta.saldo);
	
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta " + segundaConta.saldo);
	
		System.out.println(primeiraConta.saldo);
		
		segundaConta.agencia = 146;
		if(primeiraConta == segundaConta) {
			System.out.println("sao a mesmissima conta");
		} else {
			System.out.println("não são mesmo");
		}
	}	
}
