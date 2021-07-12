
public class TestaEscopoCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicional");
		
		int idade = 19;
		int quantidadePessoas = 3;
		
		//boolean acompanhado = quantidadePessoas >= 3;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("valor do acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}
}
