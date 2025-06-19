package aula16.Ativ4ClausulasDeGuardaV2;

public class Guard {
	
	public static void VerificaObjetoNulo(Object obj, String erro) throws Exception {
		if (obj == null) {
			throw new IllegalArgumentException(erro);
		}
	}
	
	public static void VerificaLivroDisponivel(Livro livro) {
		if (!livro.isDisponivel()) {
            throw new LivroIndisponivelException("Livro \"" + 
            	livro.getTitulo() + 
            	"\" não está disponível para empréstimo.");
        }
	}
	
	public static void VerificaEmprestimosCliente(Cliente cliente) {
		if (cliente.getNumLivrosEmprestados() >= 3) {
            throw new ClienteComMuitosLivrosException("Cliente \"" + 
            	cliente.getNome() + 
            	"\" já possui o número máximo de livros emprestados (3).");
        }
	}
	
	
 	

}
