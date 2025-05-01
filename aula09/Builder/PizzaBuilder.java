package aula09.Builder;

import aula09.Builder.Pizza.Sabor;
import aula09.Builder.Pizza.Tamanho;

public class PizzaBuilder {
	private Pizza pizza;
	
	public PizzaBuilder() {
		pizza = new Pizza();
	}
	
	public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }
	
	public PizzaBuilder tamanhoGrande() {
		pizza.setTamanho(Tamanho.Grande);
		return this;
	}
	public PizzaBuilder tamanhoMedio() {
		pizza.setTamanho(Tamanho.Media);
		return this;
	}
	public PizzaBuilder tamanhoPequeno() {
		pizza.setTamanho(Tamanho.Pequena);
		return this;
	}
	public PizzaBuilder tamanhoFamilia() {
		pizza.setTamanho(Tamanho.Familia);
		return this;
	}

	public PizzaBuilder saborCalabresa() {
		pizza.setSabor(Sabor.Calabresa);
		return this;
	}
	public PizzaBuilder saborFrango() {
		pizza.setSabor(Sabor.Frango);
		return this;
	}
	public PizzaBuilder saborQuatroQueijos() {
		pizza.setSabor(Sabor.QuatroQueijos);
		return this;
	}
	public PizzaBuilder saborPortuguesa() {
		pizza.setSabor(Sabor.Portuguesa);
		return this;
	}
	
	public PizzaBuilder comBorda() {
		pizza.setComBorda(true);
		return this;
	}
	public PizzaBuilder semBorda() {
		pizza.setComBorda(false);
		return this;
	}
	
	public Pizza obterPizza() {
		return pizza;
	}
}
