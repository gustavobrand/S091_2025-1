package aula16.Ativ4ClausulasDeGuardaV2;

class Cliente {
    private String nome;
    private int numLivrosEmprestados;
    
	public Cliente(String nome) {
		this.nome = nome;
		this.numLivrosEmprestados = 0;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumLivrosEmprestados() {
		return numLivrosEmprestados;
	}
	public void incrementarNumLivrosEmprestados() {
        this.numLivrosEmprestados++;
    }

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", numLivrosEmprestados=" + numLivrosEmprestados + "]";
	}
    
}
