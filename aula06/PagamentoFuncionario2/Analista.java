package aula06.PagamentoFuncionario2;

public class Analista extends Funcionario implements Calculo {

	public Analista(String nome, float salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcular() {
		float aumentoDeSalario = 400;
		float novoSalario = salario + aumentoDeSalario;
		setSalario(novoSalario);
		return novoSalario;
	}
	
	
	

}
