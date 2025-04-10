package aula06.PagamentoFuncionario2;

public class Programador extends Funcionario implements Calculo {
	protected float aumentoSalarial = 200;
	
	public Programador(String nome, float salario) {
		super(nome, salario);
	}
	
	public float getAumentoSalarial() {
		return aumentoSalarial;
	}
	public void setAumentoSalarial(float aumentoSalarial) {
		this.aumentoSalarial = aumentoSalarial;
	}

	@Override
	public float calcular() {
		float aumentoDeSalario = aumentoSalarial;
		float novoSalario = salario + aumentoDeSalario;
		setSalario(novoSalario);
		return novoSalario;
	}
	
	
	

}
