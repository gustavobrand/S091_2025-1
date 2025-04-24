package aula08.PassagemOnibus;

public class Passagem {
	private float valor;
	private String destino;
	
	public Passagem(float valor, String destino) {
		this.valor = valor;
		this.destino = destino;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	@Override
	public String toString() {
		return "Passagem [valor=" + valor + ", destino=" + destino + "]";
	}
}
