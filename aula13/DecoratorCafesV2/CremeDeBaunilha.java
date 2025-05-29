package aula13.DecoratorCafesV2;

public class CremeDeBaunilha implements Bebida {
	Bebida bebidaDecorada;
	
	public CremeDeBaunilha (Bebida bebidaDecorada) {
		this.bebidaDecorada = bebidaDecorada;
	}

	@Override
	public String getDescricao() {
		return bebidaDecorada.getDescricao() + " com Creme de Baunilha";
	}

	@Override
	public double getCusto() {
		return bebidaDecorada.getCusto() + 2.50; // Custo do creme
	}
}
