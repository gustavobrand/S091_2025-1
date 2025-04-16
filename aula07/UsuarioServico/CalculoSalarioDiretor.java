package aula07.UsuarioServico;

public class CalculoSalarioDiretor implements CalculoSalarioUsuario {

	@Override
	public float calcular(Usuario usuario) {
		float novoSalario = usuario.getSalario() + 100f;
		usuario.setSalario(novoSalario);
		return novoSalario;
	}

}
