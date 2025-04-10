package aula06.BancoDeDadosPessoa;

import java.util.ArrayList;

public class BancoDadosPessoa {
	protected ArrayList<Pessoa> pessoas;

	public BancoDadosPessoa() {
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	public void salvarPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	public void removerPessoa(Pessoa pessoa) {
		pessoas.remove(pessoa);
	}
		
	public Pessoa buscarPessoaPorCpf(String cpf) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getCpf().equalsIgnoreCase(cpf)) {
				return pessoa;
			}
		}
		return null;
	}
	
	public Pessoa buscarPessoaPorNome(String nome) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getNome().equalsIgnoreCase(nome)) {
				return pessoa;
			}
		}
		return null;
	}
	
	public Pessoa buscarPessoa(Pessoa pessoa) {
		for (Pessoa p : pessoas) {
			if (p.equals(pessoa)) {
				return p;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "BancoDadosPessoa [pessoas=" + pessoas + "]";
	}

}
