package aula11.NotaFiscal;

import java.util.ArrayList;

public class ItensNotaFiscal implements ComponenteNotaFiscal {
	private ArrayList<String> itens;
    private String descricao;

    public ItensNotaFiscal(ArrayList<String> itens, String descricao) {
		this.itens = itens;
		this.descricao = descricao;
	}

	@Override
	public void mostrar() {
		for (String item : itens) {
			System.out.println(item);
		}
		System.out.println("Descrição: " + descricao);
	}

}
