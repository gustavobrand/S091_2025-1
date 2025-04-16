package aula07.UsuarioServico2;

public class Diretor extends Usuario {
	
	public Diretor(float salario, String nome) {
		super(salario, nome);
	}

	@Override
	public float calcular() {
		float novoSalario = getSalario() + 100f;
		setSalario(novoSalario);
		return novoSalario;
	}

}
