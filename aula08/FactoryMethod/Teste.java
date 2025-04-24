package aula08.FactoryMethod;

import aula08.FactoryMethod.FabricaPagamento.TipoPagamento;

public class Teste {

	public static void main(String[] args) {
		FabricaPagamento fabrica = new FabricaPagamento();
		
		Pagamento formatoViaPix = fabrica.criar(TipoPagamento.Pix);
		Pagamento formatoViaCC = fabrica.criar(TipoPagamento.CartaoCredito);
		Pagamento formatoViaAVista = fabrica.criar(TipoPagamento.AVista);

		formatoViaAVista.realizarPagamento(100d);
		formatoViaCC.realizarPagamento(1000d);
		formatoViaPix.realizarPagamento(2000d);
		
	}

}
