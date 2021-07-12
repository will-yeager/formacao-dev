package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);
		
		System.out.println("A agencia da primeira conta é " + primeiraConta.agencia);
		
		Conta rogerio = new Conta();
		rogerio.saldo = 50000;
		rogerio.titular = "Rogerio Trindade";
		rogerio.agencia = 2000;
		rogerio.numero = 25;
		
		
	}
}
 