package aula08.FactoryMethod;

public class FabricaPagamento {
	
	public enum TipoPagamento{
		Pix,
		AVista,
		CartaoCredito
	}
	
	public Pagamento criar(TipoPagamento tipo) {
		Pagamento result = null;
		if(TipoPagamento.Pix == tipo) {
		    result = new PagamentoPix();
		} else if(TipoPagamento.AVista == tipo) {
		    result = new PagamentoAVista();
		} else if(TipoPagamento.CartaoCredito == tipo) {
		    result = new PagamentoCartaoCredito();
		}
		return result;
	}		
}
