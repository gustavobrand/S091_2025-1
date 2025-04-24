package aula08.FactoryMethod;

public class PagamentoCartaoCredito implements Pagamento {

	@Override
	public void realizarPagamento(Double valor) {
		System.out.println("pagando no cartão de crédito: " + valor);
	}

}
