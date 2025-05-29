package aula13.ObserverTelefone;

public class Teste {

	public static void main(String[] args) {
		// OBSERVER
		Telefone telefone = new Telefone();
		Secretaria secretaria = new Secretaria();
		Secretaria secretaria2 = new Secretaria();
		
		telefone.adicionarOuvinte(secretaria);
		telefone.adicionarOuvinte(secretaria2);
		
		telefone.recebendoLigacao("123465");
	}

}
