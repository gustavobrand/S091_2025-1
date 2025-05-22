package aula12.StrategyImposto;

public class Teste {

	public static void main(String[] args) {
		double valorImpoto = 50;
		CalculoImpostoContext context = new CalculoImpostoContext();		

		System.out.println("Imposto com ICMS: R$" + 
				context.calcular("icms", valorImpoto));		
		System.out.println("Imposto com IPI: R$" + 
				context.calcular("ipi", valorImpoto));		
		System.out.println("Imposto com ST: R$" +
				context.calcular("st", valorImpoto));
	}

}
