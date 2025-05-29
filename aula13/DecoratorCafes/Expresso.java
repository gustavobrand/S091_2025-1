package aula13.DecoratorCafes;

public class Expresso implements Bebida {

	@Override
	public String getDescricao() {
		return "Caf� Expresso";
	}

	@Override
	public double getCusto() {
		return 4;
	}

}
