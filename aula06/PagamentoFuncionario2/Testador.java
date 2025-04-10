package aula06.PagamentoFuncionario2;

public class Testador extends Funcionario implements Calculo {

	public Testador(String nome, float salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcular() {
		float aumentoDeSalario = 100;
		float novoSalario = salario + aumentoDeSalario;
		setSalario(novoSalario);
		return novoSalario;
	}
	
	
	

}
