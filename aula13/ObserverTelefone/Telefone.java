package aula13.ObserverTelefone;

import java.util.ArrayList;

public class Telefone {
	private ArrayList<TocouTelefone> lista;

	public Telefone() {
		lista = new ArrayList<>();
	}
	
	public void adicionarOuvinte (TocouTelefone ouvinte) {
		lista.add(ouvinte);
	}
	
	private void notificarOuvintes(String numero) {
		for (TocouTelefone ouvinte : lista) {
			ouvinte.tocou(numero);
		}
	}
	
	public void recebendoLigacao(String numero) {
		System.out.println("Recebendo ligação de "
			+ " numero: " + numero);
		notificarOuvintes(numero);
	}
}
