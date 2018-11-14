package br.com.bytebank.banco.modelo;

public abstract class Conta {
	private Cliente titular;
	private int agencia;
	private int numero;
	protected double saldo;

	public Conta(int agencia, int numero) {
		if (agencia < 1) {
			throw new IllegalArgumentException();
		}
		if (numero < 1) {
			throw new IllegalArgumentException();
		}
		this.agencia = agencia;
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public abstract void deposita(double valor);

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + (", Valor do saque: " + valor));
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta contaDestino) {
		this.saca(valor);
		contaDestino.deposita(valor);
	}

	@Override
	public String toString() {
		return "\nTitular: " + this.titular.getNome() + "\nNumero: " + this.numero + "\nAgencia: " + this.agencia + "\nSaldo: " + this.saldo
				+ "\n==============================";
	}

	@Override
	public boolean equals(Object obj) {

		Conta outra = (Conta) obj;
		if (this.agencia != outra.agencia) {
			return false;
		}

		if (this.numero != outra.numero) {
			return false;
		}

		return true;
	}

}
