package aula16.Ativ4ClausulasDeGuarda;

public class LivroIndisponivelException extends RuntimeException {
	public LivroIndisponivelException(String mensagem) {
        super(mensagem);
    }
}
