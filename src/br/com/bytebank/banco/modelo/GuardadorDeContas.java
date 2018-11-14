package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	private Object[] referencias;
	private int posicaoLivre;

	public GuardadorDeContas() {
		this.referencias = new Object[10];
	}

	public void adiciona(Object ref) {
		this.referencias[posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}

}
