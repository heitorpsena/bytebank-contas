package br.com.bytebank.banco.programa.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(11, 55);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Heitor");
		cc1.setTitular(clienteCC1);
		cc1.deposita(100.0);

		Conta cc2 = new ContaPoupanca(11, 33);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Paulo");
		cc2.setTitular(clienteCC2);
		cc2.deposita(200.0);

		Conta cc3 = new ContaCorrente(11, 22);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Arthur");
		cc3.setTitular(clienteCC3);
		cc3.deposita(300.0);

		Conta cc4 = new ContaPoupanca(11, 44);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Fernanda");
		cc4.setTitular(clienteCC4);
		cc4.deposita(400.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		 for (Conta conta : lista) {
		 System.out.println(conta);
		 }
		
		 NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		 lista.sort(comparator);
		
		 System.out.println("---------");
		
		 for (Conta conta : lista) {
		 System.out.println(conta);
		 }
		
		 System.out.println("---------");

		lista.sort(new TitularDaContaComparator());

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		return nomeC1.compareTo(nomeC2);
	}

}
