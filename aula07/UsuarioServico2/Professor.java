package aula07.UsuarioServico2;

public class Professor extends Usuario {
	
	public Professor(float salario, String nome) {
		super(salario, nome);
	}

	@Override
	public float calcular() {
		float novoSalario = getSalario() + 50f;
		setSalario(novoSalario);
		return novoSalario;
	}

}
