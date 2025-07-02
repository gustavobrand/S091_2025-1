package aula17.CamadasContaBancaria;

/**
 * Classe de Entidade/Dom�nio que representa uma Conta Banc�ria.
 * Cont�m informa��es b�sicas como nome do correntista e saldo.
 * Esta classe � utilizada para trafegar dados entre as camadas da aplica��o.
 */
public class ContaBancaria {
	private String nomeCorrentista;
	private double saldo;

	// Construtor para criar uma nova ContaBancaria
	public ContaBancaria(String nomeCorrentista, double saldo) {
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}

	// M�todos Getters para acessar as informa��es da conta
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public double getSaldo() {
		return saldo;
	}

	// M�todos Setters para modificar as informa��es da conta
	// Note: O saldo ser� modificado apenas atrav�s de opera��es de neg�cio (sacar/depositar)
	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Correntista: " + nomeCorrentista + ", Saldo: R$ " + String.format("%.2f", saldo);
	}
}

