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

	// M�todo para cadastrar um cliente
    public void cadastrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    // M�todo para adicionar um livro
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }
    
    // M�todo para emprestar um livro para um cliente
    public String emprestarLivro(Cliente cliente, Livro livro) {
        // Cl�usulas de guarda para verificar as regras de neg�cio
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente n�o pode ser nulo.");
        }
        if (livro == null) {
            throw new IllegalArgumentException("Livro n�o pode ser nulo.");
        }
        if (!livro.isDisponivel()) {
            throw new LivroIndisponivelException("Livro \"" + livro.getTitulo() + 
            		"\" n�o est� dispon�vel para empr�stimo.");
        }
        if (cliente.getNumLivrosEmprestados() >= 3) {
            throw new ClienteComMuitosLivrosException("Cliente \"" + cliente.getNome() + 
            		"\" j� possui o n�mero m�ximo de livros emprestados (3).");
        }

        // Se todas as regras forem satisfeitas, realizar o empr�stimo
        cliente.incrementarNumLivrosEmprestados();
        livro.setDisponivel(false);
        return "Livro \"" + livro.getTitulo() + 
        		"\" emprestado com sucesso para o cliente \"" + cliente.getNome() + "\".";
    }
    
}
