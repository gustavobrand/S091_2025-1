package aula09.Builder;

import aula09.Builder.Pizza.Sabor;
import aula09.Builder.Pizza.Tamanho;

public class Teste {

	public static void main(String[] args) {
		
		Pizza pizza1 = PizzaBuilder
				.builder()
				.comBorda()
				.saborPortuguesa()
				.saborCalabresa()
				.tamanhoFamilia()
				.obterPizza();		
		System.out.println(pizza1);
		
		Pizza pizza2 = PizzaBuilder2
				.builder()
				.semBorda()
				.sabor(Sabor.QuatroQueijos)
				.tamanho(Tamanho.Media)
				.obterPizza();
		System.out.println(pizza2);

	}

}
