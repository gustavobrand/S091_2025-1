package aula07.UsuarioServico2;

import java.util.ArrayList;

public class UsuarioServico {
	private ArrayList<Usuario> lista;
	private ValidacaoUsuario validacaoUsuario;
	
	public UsuarioServico() {
		this.lista = new ArrayList<Usuario>();
		this.validacaoUsuario = new ValidacaoUsuario();
	}
	
	public void salvarUsuario(Usuario usuario)  {
		
		validacaoUsuario.validacaoUsuario(usuario);		
		float salarioCalculado = usuario.calcular();
		usuario.setSalario(salarioCalculado);
		lista.add(usuario);
		System.out.println("usuário " + usuario.nome + 
				", R$" + usuario.salario  +" salvo com sucesso");
	}	
}
