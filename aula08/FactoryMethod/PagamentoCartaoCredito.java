package aula08.FactoryMethod;

public class PagamentoCartaoCredito implements Pagamento {

	@Override
	public void realizarPagamento(Double valor) {
		System.out.println("pagando no cart�o de cr�dito: " + valor);
	}

}
