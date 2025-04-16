package aula07.UsuarioServico;

import java.util.ArrayList;

public class UsuarioServico {
	private ArrayList<Usuario> lista;
	private ValidacaoUsuario validacaoUsuario;
	private CalculaladoraSalarioUsuario calculaladoraSalarioUsuario;
	
	public UsuarioServico() {
		this.lista = new ArrayList<Usuario>();
		this.validacaoUsuario = new ValidacaoUsuario();
		this.calculaladoraSalarioUsuario = new CalculaladoraSalarioUsuario();
	}
	
	public void salvarUsuario(Usuario usuario)  {
		
		validacaoUsuario.validacaoUsuario(usuario);		
		float salarioCalculado = calculaladoraSalarioUsuario.calcular(usuario);
		usuario.setSalario(salarioCalculado);
		lista.add(usuario);
		System.out.println("usuário " + usuario.nome + 
				", R$" + usuario.salario  +" salvo com sucesso");
	}	
}
