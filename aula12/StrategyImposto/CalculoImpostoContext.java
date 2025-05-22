package aula12.StrategyImposto;

import java.util.*;

public class CalculoImpostoContext { 
	private Map<String, CalcularImposto> mapa;

	public CalculoImpostoContext() {
		this.mapa = new HashMap<>();
		mapa.put("icms", new ImpostoICMSStrategy());
	    mapa.put("ipi", new ImpostoIPIStrategy());
	    mapa.put("st", new ImpostoSTStrategy());
	}
	
	public double calcular(String nomeImposto, double valor) {
		  return mapa.get(nomeImposto).calcular(valor);
	}	
	
}
