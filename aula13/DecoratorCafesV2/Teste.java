package aula13.DecoratorCafesV2;

public class Teste {

	public static void main(String[] args) {
		System.out.println("--- Pedidos de Bebidas ---");

		// 1. Café Expresso puro
		Bebida cafe1 = new Expresso();
		System.out.println(cafe1.getDescricao() + " - R$ " + 
				String.format("%.2f", cafe1.getCusto()));

		// 2. Cappuccino com Leite
		Bebida cafe2 = new Cappuccino();
		cafe2 = new Leite(cafe2); // Decorando o Cappuccino com Leite
		System.out.println(cafe2.getDescricao() + " - R$ " + 
				String.format("%.2f", cafe2.getCusto()));

		// 3. Café Normal com Chocolate e Chantilly
		Bebida cafe3 = new CafeNormal();
		cafe3 = new Chocolate(cafe3);    // Decorando o Café Normal com Chocolate
		cafe3 = new Chantilly(cafe3);    // Decorando o resultado (Café Normal com Chocolate) com Chantilly
		System.out.println(cafe3.getDescricao() + " - R$ " + 
				String.format("%.2f", cafe3.getCusto()));

		// 4. Expresso com Leite, Chocolate e Chantilly (todos os adicionais!)
		Bebida cafe4_1 = new Expresso();
		Bebida cafe4_2 = new Leite(cafe4_1);
		Bebida cafe4_3 = new Chocolate(cafe4_2);
		Bebida cafe4_4 = new Chantilly(cafe4_3);
		System.out.println(cafe4_4.getDescricao() + " - R$ " + 
				String.format("%.2f", cafe4_4.getCusto()));
		
		Bebida cafe4_unico = new Chantilly(
								new Leite(
									new Chocolate(
										new Expresso())));		
		System.out.println(cafe4_unico.getDescricao() + " - R$ " + 
				String.format("%.2f", cafe4_unico.getCusto()));
		
		

	}

}
