package aula16.Ativ4ClausulasDeGuarda;

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
    public String emprestarLivro(Cliente cliente, Livro livro) {
        // Cláusulas de guarda para verificar as regras de negócio
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente não pode ser nulo.");
        }
        if (livro == null) {
            throw new IllegalArgumentException("Livro não pode ser nulo.");
        }
        if (!livro.isDisponivel()) {
            throw new LivroIndisponivelException("Livro \"" + livro.getTitulo() + 
            		"\" não está disponível para empréstimo.");
        }
        if (cliente.getNumLivrosEmprestados() >= 3) {
            throw new ClienteComMuitosLivrosException("Cliente \"" + cliente.getNome() + 
            		"\" já possui o número máximo de livros emprestados (3).");
        }

        // Se todas as regras forem satisfeitas, realizar o empréstimo
        cliente.incrementarNumLivrosEmprestados();
        livro.setDisponivel(false);
        return "Livro \"" + livro.getTitulo() + 
        		"\" emprestado com sucesso para o cliente \"" + cliente.getNome() + "\".";
    }
    
}
