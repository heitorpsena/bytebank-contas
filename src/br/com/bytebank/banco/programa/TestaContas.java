package br.com.bytebank.banco.programa;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaContas {
	public static void main(String[] args) {
//
//		 ContaCorrente cc = new ContaCorrente(0001, 1111);
//		 cc.deposita(100.0);
//		 try {
//		 cc.saca(90.0);
//		 } catch (SaldoInsuficienteException ex) {
//		 System.out.println(ex.getMessage());
//		 }
//		 System.out.println("Saldo CC: " + cc.getSaldo());
//
//		 ContaPoupanca cp = new ContaPoupanca(0001, 2222);
//		 cp.deposita(300.0);
//		 System.out.println("Saldo CP: " + cp.getSaldo());

		ContaCorrente cc = new ContaCorrente(1, 1234);
		ContaPoupanca cp = new ContaPoupanca(1, 1223);

		cc.deposita(500.0);
		cp.deposita(300.0);

		System.out.println(cc);
		System.out.println(cp);
	}
}
