package aula14.StrategyAtiv3T2;

public class PagamentoCartaoDeDebito implements CalcularPagamento {
	private float percentualDeCobranca;

	public PagamentoCartaoDeDebito() {
		this.percentualDeCobranca = 0.02f;
	}

	@Override
	public Float calcular(Float valor) {
		return (valor * (1 + percentualDeCobranca));
	}
}
