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

	// M�todo para cadastrar um cliente
    public void cadastrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    // M�todo para adicionar um livro
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }
    
    // M�todo para emprestar um livro para um cliente
    public String emprestarLivro(Cliente cliente, Livro livro) throws Exception {
        // Cl�usulas de guarda para verificar as regras de neg�cio
    	Guard.VerificaObjetoNulo(cliente, "Cliente n�o pode ser nulo.");
    	Guard.VerificaObjetoNulo(livro, "Livro n�o pode ser nulo.");
        Guard.VerificaLivroDisponivel(livro);
        Guard.VerificaEmprestimosCliente(cliente);

        // Se todas as regras forem satisfeitas, realizar o empr�stimo
        cliente.incrementarNumLivrosEmprestados();
        livro.setDisponivel(false);
        return "Livro \"" + livro.getTitulo() + 
        		"\" emprestado com sucesso para o cliente \"" + 
        		cliente.getNome() + "\".";
    }
    
}
