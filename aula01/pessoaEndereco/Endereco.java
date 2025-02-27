package aula01.pessoaEndereco;

public class Endereco {
	
	private String rua;
	private int numero;
	
	// Source -> generate constructor using fields
	public Endereco() {}
	
	public Endereco(String rua, int numero) {
		this.rua = rua;
		this.numero = numero;
	}
	
	// Source -> generate Getters and Setters
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	// Source -> generate toString
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + "]";
	}
	
}
