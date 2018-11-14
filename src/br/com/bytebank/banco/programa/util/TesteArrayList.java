package br.com.bytebank.banco.programa.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {
	public static void main(String[] args) {

		// EXEMPLO
		// ArrayList lista2 = new ArrayList(20);
		//
		// Cliente cliente1 = new Cliente();
		// cliente1.setNome("Heitor");
		// lista2.add(cliente1);
		//
		// Cliente cliente2 = new Cliente();
		// cliente2.setNome("Jose");
		// lista2.add(cliente2);
		//
		// ArrayList lista3 = new ArrayList(lista2);
		// System.out.println(lista3.get(0));
		// System.out.println(lista2.size());
		// System.out.println(lista3.size());

		ArrayList<Conta> lista = new ArrayList<>();

		Conta cc = new ContaCorrente(11, 22);
		cc.deposita(100.0);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(11, 33);
		cc2.deposita(300.0);
		lista.add(cc2);

		// System.out.println("Tamanho: " + lista.size());
		//
		// System.out.println(lista.get(0));
		//
		// Conta ref = lista.get(1);
		// System.out.println(lista.get(1));
		//
		// lista.remove(1);
		// System.out.println("Tamanho: " + lista.size());
		//
		//
		// for(int i = 0; i < lista.size(); i++) {
		// System.out.println(lista.get(i));
		// }

	}
}
