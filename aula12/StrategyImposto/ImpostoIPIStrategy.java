package aula12.StrategyImposto;

public class ImpostoIPIStrategy implements CalcularImposto {

	@Override
	public Double calcular(Double valor) {
		return valor + 5;
	}

}
