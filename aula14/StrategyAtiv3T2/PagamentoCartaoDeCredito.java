package aula14.StrategyAtiv3T2;

public class PagamentoCartaoDeCredito implements CalcularPagamento {
	private float percentualDeCobranca;

	public PagamentoCartaoDeCredito() {
		this.percentualDeCobranca = 0.05f;
	}

	@Override
	public Float calcular(Float valor) {
		return (valor * (1 + percentualDeCobranca));
		
		// Outra forma de fazer a mesma coisa:
		// float valorAMais = valor * percentualDeCobranca;
		// return (valor + valorAMais);
	}

}
