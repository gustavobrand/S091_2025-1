package aula11.NotaFiscal;

import java.util.ArrayList;

public class NotaFiscal implements ComponenteNotaFiscal {
	private ArrayList<ComponenteNotaFiscal> linhas;	
	
	public NotaFiscal() {
		this.linhas = new ArrayList<ComponenteNotaFiscal>();
	}

	public void AdicionarLinha(ComponenteNotaFiscal item) {
		linhas.add(item);
	}
	public void RemoverLinha(ComponenteNotaFiscal item) {
		linhas.remove(item);
	}

	@Override
	public void mostrar() {
		System.out.println("-----");
		for (ComponenteNotaFiscal linha : linhas) {
			linha.mostrar();
		}
		System.out.println("-----");
	}

}
