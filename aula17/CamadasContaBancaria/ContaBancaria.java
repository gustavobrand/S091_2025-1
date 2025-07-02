package aula17.CamadasContaBancaria;

/**
 * Classe de Entidade/Domínio que representa uma Conta Bancária.
 * Contém informações básicas como nome do correntista e saldo.
 * Esta classe é utilizada para trafegar dados entre as camadas da aplicação.
 */
public class ContaBancaria {
	private String nomeCorrentista;
	private double saldo;

	// Construtor para criar uma nova ContaBancaria
	public ContaBancaria(String nomeCorrentista, double saldo) {
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}

	// Métodos Getters para acessar as informações da conta
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public double getSaldo() {
		return saldo;
	}

	// Métodos Setters para modificar as informações da conta
	// Note: O saldo será modificado apenas através de operações de negócio (sacar/depositar)
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

