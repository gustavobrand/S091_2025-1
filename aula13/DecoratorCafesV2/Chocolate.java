package aula13.DecoratorCafesV2;

public class Chocolate implements Bebida {
	Bebida bebidaDecorada;
	
	public Chocolate (Bebida bebidaDecorada) {
		this.bebidaDecorada = bebidaDecorada;
	}

	@Override
	public String getDescricao() {
		return bebidaDecorada.getDescricao() + " com Chocolate";
	}

	@Override
	public double getCusto() {
		return bebidaDecorada.getCusto() + 2.00;
	}
}
