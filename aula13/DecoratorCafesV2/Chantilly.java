package aula13.DecoratorCafesV2;

public class Chantilly implements Bebida {
	Bebida bebidaDecorada;
	
	public Chantilly (Bebida bebidaDecorada) {
		this.bebidaDecorada = bebidaDecorada;
	}

	@Override
	public String getDescricao() {
		return bebidaDecorada.getDescricao() + " com Chantilly";
	}

	@Override
	public double getCusto() {
		 return bebidaDecorada.getCusto() + 1.00;
	}
}
