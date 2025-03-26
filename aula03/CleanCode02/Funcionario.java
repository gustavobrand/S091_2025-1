package aula03.CleanCode02;

public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private String dataDeNascimento;
    private float salario;
    
    public Funcionario() {}
    public Funcionario(String nome, int idade, 
    		String dataDeNascimento, float salario) {
    	this.id = (int)(Math.random());
		this.nome = nome;
		this.idade = idade;
		this.dataDeNascimento = dataDeNascimento;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", idade=" + idade + ", dataDeNascimento="
				+ dataDeNascimento + ", salario=" + salario + "]";
	}
    
}
