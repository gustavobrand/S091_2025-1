package aula07.UsuarioServico;

public class Usuario {
	protected float salario;
	protected String nome;
	protected CalculoSalarioUsuario calculoSalarioUsuario;
	
	public Usuario(float salario, String nome, 
			CalculoSalarioUsuario calculoSalarioUsuario) {
		this.salario = salario;
		this.nome = nome;
		this.calculoSalarioUsuario = calculoSalarioUsuario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CalculoSalarioUsuario getCalculoSalarioUsuario() {
		return calculoSalarioUsuario;
	}

	public void setCalculoSalarioUsuario(CalculoSalarioUsuario calculoSalarioUsuario) {
		this.calculoSalarioUsuario = calculoSalarioUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [salario=" + salario + ", nome=" + nome + ", calculoSalarioUsuario=" + calculoSalarioUsuario
				+ "]";
	}
	
}
