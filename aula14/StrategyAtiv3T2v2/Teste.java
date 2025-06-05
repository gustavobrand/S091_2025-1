package aula14.StrategyAtiv3T2v2;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculoPagamentoContext contexto = new CalculoPagamentoContext();		
		
		System.out.print("Valor a pagar : R$");
		float valorDoPagamento = scanner.nextFloat();
		
		System.out.println("Escolha uma opção de pagamento: ");
		System.out.println("  1 : Cartão de Crédito");
		System.out.println("  2 : Cartão de Debito");
		System.out.println("  3 : Boleto Bancario");
		int opcaoDePagamento = scanner.nextInt();
		
		if (opcaoDePagamento == 1) {
			System.out.println("Credito: R$" + 
				String.format("%.2f", contexto.calcular(1, valorDoPagamento)));
		} else if (opcaoDePagamento == 2) {
			System.out.println("Debito: R$" +
				String.format("%.2f", contexto.calcular(2, valorDoPagamento)));
		} else if (opcaoDePagamento == 3) {
			System.out.println("Boleto: R$" +
				String.format("%.2f", contexto.calcular(3, valorDoPagamento)));
		} else {
			System.out.println("Opção invalida, execute o pagamento novamente");
		}
	}
}
