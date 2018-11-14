package br.com.bytebank.banco.programa;

public class TesteString {
	public static void main(String[] args) {

		String nome = "Heitor";
		// nome = nome.replace("H", "h");
		// System.out.println(nome);

		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}
}
