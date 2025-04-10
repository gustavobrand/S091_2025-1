package aula06.PagamentoFuncionario2;

public class Teste {

	public static void main(String[] args) {
		CalculaPagamento calculaPagamento = new CalculaPagamento();
		
		Programador programador = new Programador("Joao", 1000);
		System.out.println(calculaPagamento.calcular(programador));

		Analista analista = new Analista ("Maria", 2000);
		System.out.println(calculaPagamento.calcular(analista));
		// System.out.println(calculaPagamento.calcular(new AnalistaCalculo(), analista));

		Testador testador = new Testador("Miguel", 900);
		System.out.println(calculaPagamento.calcular(testador));
	}

}
