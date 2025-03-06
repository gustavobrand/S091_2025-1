package aula02.Conta;

public class ContaPoupanca implements Conta {
	private float saldo;
	private String nome;
	private float percentualDeRendimento;
	
	public ContaPoupanca(float saldo, String nome, float percentualDeRendimento) {
		this.saldo = saldo;
		this.nome = nome;
		this.percentualDeRendimento = percentualDeRendimento;
	}
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPercentualDeRendimento() {
		return percentualDeRendimento;
	}
	public void setPercentualDeRendimento(float percentualDeRendimento) {
		this.percentualDeRendimento = percentualDeRendimento;
	}

	@Override
	public void depositar(float valor) {
		if (valor > 0) {
			saldo = saldo + valor;
		}
	}

	@Override
	public boolean sacar(float valor) {
		if (valor <= saldo && valor >= 0) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}


	@Override
	public String toString() {
		return "ContaPoupanca [saldo=" + saldo + ", nome=" + nome + ", percentualDeRendimento=" + percentualDeRendimento
				+ "]";
	}
	
}
