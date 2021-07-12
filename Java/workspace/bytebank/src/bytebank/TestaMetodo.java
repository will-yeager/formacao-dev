package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoWilliam = new Conta();
		contaDoWilliam.saldo = 100;
		System.out.println(contaDoWilliam.saldo);
		contaDoWilliam.deposita(50);
		System.out.println(contaDoWilliam.saldo);
		boolean conseguiuRetirar = contaDoWilliam.saca(20);
		System.out.println(contaDoWilliam.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaAnna = new Conta();
		contaDaAnna.deposita(1000);
		
		boolean sucessoTransferencia = 
				contaDaAnna.transfere(300, contaDoWilliam);
		
		if(sucessoTransferencia) {
			System.out.println("A transferencia foi feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaAnna.saldo);
		System.out.println(contaDoWilliam.saldo);
	
		contaDoWilliam.titular = "William Jonathan";
		System.out.println(contaDoWilliam.titular);
	}
}
