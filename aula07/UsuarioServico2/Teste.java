package aula07.UsuarioServico2;

public class Teste {

	public static void main(String[] args) {
		UsuarioServico usuarioServico = new UsuarioServico();
		
		Diretor diretor = new Diretor(1000, "Joao");
		Professor professor = new Professor(1000, "Maria");
		
		usuarioServico.salvarUsuario(diretor);
		usuarioServico.salvarUsuario(professor);
	}

}
