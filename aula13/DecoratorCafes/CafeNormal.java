package aula13.DecoratorCafes;

public class CafeNormal implements Bebida {

	@Override
	public String getDescricao() {
		return "Caf� Normal";
	}

	@Override
	public double getCusto() {
		return 3;
	}

}
