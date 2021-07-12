public class FluxoComTratamento {
	
	public static void main(String[] args) {
		System.out.println("ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception" + msg);
			ex.printStackTrace();
		} 
		System.out.println("fim do main");
	}
	
	private static void metodo1() throws MinhaExcecao {
		System.out.println("ini do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}
	
	private static void metodo2() throws MinhaExcecao {
		System.out.println("ini do metodo2");
		for(int i = 1;i <=5; i++) {
			System.out.println(i);
			// int a = i / 0;
			Conta c = null;
			c.deposita();
		}
		System.out.println("Fim do metodo2");
	}

}
