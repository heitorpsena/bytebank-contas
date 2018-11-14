package br.com.bytebank.banco.programa;
import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(100.0);
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		calculadorDeImposto.registra(cc);
		System.out.println(calculadorDeImposto.getTotalImposto());
	}
}
