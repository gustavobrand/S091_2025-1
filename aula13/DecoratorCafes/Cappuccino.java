package aula13.DecoratorCafes;

public class Cappuccino implements Bebida {

	@Override
	public String getDescricao() {
		return "Café Cappuccino";
	}

	@Override
	public double getCusto() {
		return 6;
	}

}
