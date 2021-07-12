
public class TesteIR {

	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A sua aliqutoa é 7.5%");
			System.out.println("Pode deduzir o valor de R$142,00");
		} else if (salario >= 2801.01 && salario <= 3751.0) {
			System.out.println("A sua aliquota é 15%");
			System.out.println("Pode deduzir o valor R$350,00");
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("A sua aliquota é 22.5%");
			System.out.println("Pode deduzir o valor R$636,00");
		}  
	}
}
