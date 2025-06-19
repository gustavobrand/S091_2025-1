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
            	"\" n�o est� dispon�vel para empr�stimo.");
        }
	}
	
	public static void VerificaEmprestimosCliente(Cliente cliente) {
		if (cliente.getNumLivrosEmprestados() >= 3) {
            throw new ClienteComMuitosLivrosException("Cliente \"" + 
            	cliente.getNome() + 
            	"\" j� possui o n�mero m�ximo de livros emprestados (3).");
        }
	}
	
	
 	

}
