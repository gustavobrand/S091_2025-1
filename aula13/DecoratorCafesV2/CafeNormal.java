package aula13.DecoratorCafesV2;

public class CafeNormal implements Bebida {

	@Override
	public String getDescricao() {
		return "Café Normal";
	}

	@Override
	public double getCusto() {
		return 3;
	}

}
