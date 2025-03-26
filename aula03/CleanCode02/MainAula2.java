package aula03.CleanCode02;

public class MainAula2 {

	public static void main(String[] args) {
		CalculadoraPagamento novoCalculoDeSalario;
		novoCalculoDeSalario = new CalculadoraPagamento(
				"Maria", 30, "26/06/1990", 0);
		
        float retorno = novoCalculoDeSalario.retornarCalculoFuncionario();
        System.out.println("Novo salario: R$" + retorno);
	}

}
