package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = "    ALURA   ";
		vazio =  vazio.trim();
		
		System.out.println(vazio.contains("ALU"));
		
		System.out.println(vazio);
		System.out.println(vazio.isEmpty());
		
		String nome = "Alura";//object literal
		//String outro = new String("Aula");
		
		for(int i = 0; i < nome.length(); i++ ) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println(nome.length());

		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		char e = nome.charAt(2);
		System.out.println(e);
		
		char c = 'A';
		char d = 'a';
		
		String nomeAtualizado = nome.replace(c, d);
		nome.toLowerCase();
		System.out.println(nomeAtualizado);
	}
}
