package aula13.DecoratorCafesV2;

public class Leite implements Bebida {
	Bebida bebidaDecorada;
	
	public Leite (Bebida bebidaDecorada) {
		this.bebidaDecorada = bebidaDecorada;
	}

	@Override
	public String getDescricao() {
		return bebidaDecorada.getDescricao() + " com Leite";
	}

	@Override
	public double getCusto() {
		return bebidaDecorada.getCusto() + 1.50;
	}

}
