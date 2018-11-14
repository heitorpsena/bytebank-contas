package br.com.bytebank.banco.programa;
import br.com.bytebank.banco.modelo.Conexao;

public class TestaConexao {
	public static void main(String[] args) {
		try (Conexao con = new Conexao()) {
			con.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
	}
}
