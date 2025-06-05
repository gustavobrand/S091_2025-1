package aula14.StrategyAtiv3T2v2;

public abstract class PagamentoConcreto implements CalcularPagamento {
	private float percentualDeCobranca;

	public PagamentoConcreto(float percentualDeCobranca) {
		this.percentualDeCobranca = percentualDeCobranca;
	}

	@Override
	public Float calcular(Float valor) {
		return (valor * (1 + percentualDeCobranca));
	}
}
