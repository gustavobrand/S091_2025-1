package aula09.Builder;

import aula09.Builder.Pizza.Sabor;
import aula09.Builder.Pizza.Tamanho;

public class PizzaBuilder2 {
	private Pizza pizza;
	
	public PizzaBuilder2() {
		pizza = new Pizza();
	}
	
	public static PizzaBuilder2 builder() {
        return new PizzaBuilder2();
    }
	
	public PizzaBuilder2 tamanho(Tamanho t) {
		pizza.setTamanho(t);
		return this;
	}

	public PizzaBuilder2 sabor(Sabor s) {
		pizza.setSabor(s);
		return this;
	}

	public PizzaBuilder2 comBorda() {
		pizza.setComBorda(true);
		return this;
	}
	public PizzaBuilder2 semBorda() {
		pizza.setComBorda(false);
		return this;
	}
	
	public Pizza obterPizza() {
		return pizza;
	}
}
