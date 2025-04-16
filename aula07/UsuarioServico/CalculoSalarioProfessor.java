package aula07.UsuarioServico;

public class CalculoSalarioProfessor implements CalculoSalarioUsuario {

	@Override
	public float calcular(Usuario usuario) {
		float novoSalario = usuario.getSalario() + 50f;
		usuario.setSalario(novoSalario);
		return novoSalario;
	}

}
