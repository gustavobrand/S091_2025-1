package aula07.UsuarioServico;

public class Teste {

	public static void main(String[] args) {
		UsuarioServico usuarioServico = new UsuarioServico();
		
		Usuario diretor = new Usuario(1000, "Joao", 
				new CalculoSalarioDiretor());
		Usuario professor = new Usuario(1000, "Maria", 
				new CalculoSalarioProfessor());
		
		usuarioServico.salvarUsuario(diretor);
		usuarioServico.salvarUsuario(professor);
	}

}
