package aula12.StrategyImposto;

public class ImpostoSTStrategy implements CalcularImposto {

	@Override
	public Double calcular(Double valor) {
		return valor + 20;
	}

}
