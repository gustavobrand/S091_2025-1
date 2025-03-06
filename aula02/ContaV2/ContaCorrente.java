package aula02.ContaV2;

public class ContaCorrente extends ContaBancaria implements Conta{
	private float limite;
	private float tarifa;
	
	public ContaCorrente(float saldo, String nome, float limite, float tarifa) {
		super(saldo, nome);
		this.limite = limite;
		this.tarifa = tarifa;
	}
	
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTarifa() {
		return tarifa;
	}
	public void setTarifa(float tarifa) {
		this.tarifa = tarifa;
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
		return "ContaCorrente [limite=" + limite + ", tarifa=" + tarifa + ", saldo=" + saldo + ", nome=" + nome + "]";
	}

}
