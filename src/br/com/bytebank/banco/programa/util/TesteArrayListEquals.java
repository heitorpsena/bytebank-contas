package br.com.bytebank.banco.programa.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<>();

		Conta cc = new ContaCorrente(11, 33);
		cc.deposita(100.0);
		// lista.add(cc);

		Conta cc2 = new ContaCorrente(11, 33);
		cc2.deposita(300.0);
		lista.add(cc2);

		Conta ref = lista.get(0);
		System.out.println(ref);

		// for (int i = 0; i < lista.size(); i++) {
		// System.out.println(lista.get(i));
		// }

	}
}
