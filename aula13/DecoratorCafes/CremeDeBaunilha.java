package aula13.DecoratorCafes;

public class CremeDeBaunilha extends CondimentoDecorator {
	
	public CremeDeBaunilha(Bebida bebidaDecorada) {
		super(bebidaDecorada);
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
