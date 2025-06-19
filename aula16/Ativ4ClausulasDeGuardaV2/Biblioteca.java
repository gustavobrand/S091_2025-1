package aula16.Ativ4ClausulasDeGuardaV2;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Cliente> clientes;
    private List<Livro> livros;
    
	public Biblioteca() {
		this.clientes = new ArrayList<Cliente>();
		this.livros = new ArrayList<Livro>();
	}

	// Método para cadastrar um cliente
    public void cadastrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    // Método para adicionar um livro
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }
    
    // Método para emprestar um livro para um cliente
    public String emprestarLivro(Cliente cliente, Livro livro) throws Exception {
        // Cláusulas de guarda para verificar as regras de negócio
    	Guard.VerificaObjetoNulo(cliente, "Cliente não pode ser nulo.");
    	Guard.VerificaObjetoNulo(livro, "Livro não pode ser nulo.");
        Guard.VerificaLivroDisponivel(livro);
        Guard.VerificaEmprestimosCliente(cliente);

        // Se todas as regras forem satisfeitas, realizar o empréstimo
        cliente.incrementarNumLivrosEmprestados();
        livro.setDisponivel(false);
        return "Livro \"" + livro.getTitulo() + 
        		"\" emprestado com sucesso para o cliente \"" + 
        		cliente.getNome() + "\".";
    }
    
}
