
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicional");
		int idade = 19;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 3;
		
		System.out.println("valor do acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}
	}
}
