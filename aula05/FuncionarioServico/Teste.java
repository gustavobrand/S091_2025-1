package aula05.FuncionarioServico;

public class Teste {

	public static void main(String[] args) {
		Funcionario joao = new Funcionario("Joao", 30, "1/1/90", 1000f);
//		System.out.println(joao);
		
		FuncionarioServico loja = new FuncionarioServico(joao);
		loja.editarFuncionario();

	}

}
