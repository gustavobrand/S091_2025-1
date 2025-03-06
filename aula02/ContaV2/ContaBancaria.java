package aula02.ContaV2;

public class ContaBancaria {
	protected float saldo;
	protected String nome;
	
	public ContaBancaria(float saldo, String nome) {
		this.saldo = saldo;
		this.nome = nome;
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
	
	@Override
	public String toString() {
		return "ContaBancaria [saldo=" + saldo + ", nome=" + nome + "]";
	}
		
}
