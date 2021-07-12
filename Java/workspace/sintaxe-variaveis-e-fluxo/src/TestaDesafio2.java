
public class TestaDesafio2 {

	public static void main(String[] args) {
		for (int numero = 1; numero <= 10; numero++) {
			int resultado = 1;
			System.out.println();
			System.out.print(numero + "! = ");
			for (int fatorial = numero; fatorial >= 1; fatorial--) {
				resultado = resultado * fatorial;
				if(fatorial == 1) {
					System.out.print(fatorial + " = " + resultado);
					break;
				}
				System.out.print(fatorial + " x ");
			}
		}
	}
}
 