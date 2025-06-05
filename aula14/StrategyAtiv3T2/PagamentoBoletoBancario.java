package aula14.StrategyAtiv3T2;

public class PagamentoBoletoBancario implements CalcularPagamento {
	private float percentualDeCobranca;

	public PagamentoBoletoBancario() {
		this.percentualDeCobranca = 0.00f;
	}

	@Override
	public Float calcular(Float valor) {
		return (valor * (1 + percentualDeCobranca));
	}
}
