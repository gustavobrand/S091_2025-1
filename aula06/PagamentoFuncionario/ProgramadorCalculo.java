package aula06.PagamentoFuncionario;

public class ProgramadorCalculo implements Calculo {

	@Override
	public float calcular(Funcionario funcionario) {
		float aumentoDeSalario = 200;
		float novoSalario = funcionario.getSalario() + aumentoDeSalario;
		funcionario.setSalario(novoSalario);
		return novoSalario;
	}

}
