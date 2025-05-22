package aula12.StrategyImposto;

public class ImpostoICMSStrategy implements CalcularImposto {

	@Override
	public Double calcular(Double valor) {
		return valor + 10;
	}
}
