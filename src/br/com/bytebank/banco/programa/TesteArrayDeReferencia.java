package br.com.bytebank.banco.programa;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayDeReferencia {
	public static void main(String[] args) {
		ContaCorrente[] contas = new ContaCorrente[5];

		ContaCorrente cc1 = new ContaCorrente(11, 22);
		ContaCorrente cc2 = new ContaCorrente(22, 33);

		contas[0] = cc1;
		contas[1] = cc2;

		ContaCorrente[] contas2 = { cc1, cc2 };

		System.out.println(contas2[0].getNumero());

		String[] nome = new String[6];
		nome[0] = "h";
		nome[1] = "e";
		nome[2] = "i";
		nome[3] = "t";
		nome[4] = "o";
		nome[5] = "r";

		for (int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
		}

	}
}
