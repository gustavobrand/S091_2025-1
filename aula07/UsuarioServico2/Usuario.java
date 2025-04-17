package aula07.UsuarioServico2;

public abstract class Usuario implements CalculoSalarioUsuario {
	protected float salario;
	protected String nome;
	
	public Usuario(float salario, String nome) {
		this.salario = salario;
		this.nome = nome;
	}
	
	public abstract float calcular();

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

	@Override
	public String toString() {
		return "Usuario [salario=" + salario + ", nome=" + nome + "]";
	}
	
}
