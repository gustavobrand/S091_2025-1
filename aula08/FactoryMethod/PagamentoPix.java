package aula08.FactoryMethod;

public class PagamentoPix implements Pagamento {

	@Override
	public void realizarPagamento(Double valor) {
		System.out.println("pagando via PIX: " + valor);
	}

}
