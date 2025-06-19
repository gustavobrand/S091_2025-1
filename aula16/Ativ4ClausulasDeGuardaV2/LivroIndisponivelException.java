package aula16.Ativ4ClausulasDeGuardaV2;

public class LivroIndisponivelException extends RuntimeException {
	public LivroIndisponivelException(String mensagem) {
        super(mensagem);
    }
}
