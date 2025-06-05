package aula14.StrategyAtiv3T2v2;

import java.util.*;

public class CalculoPagamentoContext { 
	private Map<Integer, CalcularPagamento> mapa;

	public CalculoPagamentoContext() {
		this.mapa = new HashMap<>();
		mapa.put(1, new PagamentoCartaoDeCredito());
	    mapa.put(2, new PagamentoCartaoDeDebito());
	    mapa.put(3, new PagamentoBoletoBancario());
	}
	
	public float calcular(Integer tipoDePagamento, float valor) {
		  return mapa.get(tipoDePagamento).calcular(valor);
	}	
	
}
