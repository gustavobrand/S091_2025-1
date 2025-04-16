package aula07.UsuarioServico;

public class ValidacaoUsuario {
	public void validacaoUsuario(Usuario usuario) {
		if(usuario == null ) {
			throw new IllegalArgumentException("usuario esta null");
		}
		if(usuario.nome.equals("")) {
			throw new IllegalArgumentException("nome em branco");
		}		
	}
}
