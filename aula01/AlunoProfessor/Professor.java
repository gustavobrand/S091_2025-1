package aula01.AlunoProfessor;

public class Professor extends Pessoa {
	private int salaDeAula;

	public Professor(String nome, int idade, String endereco, String telefone, int salaDeAula) {
		super(nome, idade, endereco, telefone);
		this.salaDeAula = salaDeAula;
	}

	public int getSalaDeAula() {
		return salaDeAula;
	}
	public void setSalaDeAula(int salaDeAula) {
		this.salaDeAula = salaDeAula;
	}
	
	public int salaQueDaAula() {
		return salaDeAula;
	}

	@Override
	public String toString() {
		return "Professor [salaDeAula=" + salaDeAula + ", nome=" + nome + ", idade=" + idade + ", endereco=" + endereco
				+ ", telefone=" + telefone + "]";
	}
	
}
