package aula06.PagamentoFuncionario;

public class Teste {

	public static void main(String[] args) {
		CalculaPagamento calculaPagamento = new CalculaPagamento();
		
		Funcionario programador = new Funcionario("Joao", 1000);
		System.out.println(calculaPagamento.calcular(new ProgramadorCalculo(), programador));

		Funcionario analista = new Funcionario("Maria", 2000);
		System.out.println(calculaPagamento.calcular(new AnalistaCalculo(), analista));

	}

}
